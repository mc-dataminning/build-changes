import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import org.slf4j.Logger;

public class eff {
   private static final Logger d = LogUtils.getLogger();
   public static final eff a = new eff(ehh.b, Optional.empty(), List.of(), List.of());
   public static final ehg b = ehh.n;
   public static final Codec<eff> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ehh.a.optionalFieldOf("type", b).forGetter($$0x -> $$0x.e),
               asu.a(agi.a, "random_sequence").forGetter($$0x -> $$0x.f),
               asu.a(efe.a.listOf(), "pools", List.of()).forGetter($$0x -> $$0x.g),
               asu.a(egm.b.listOf(), "functions", List.of()).forGetter($$0x -> $$0x.h)
            )
            .apply($$0, eff::new)
   );
   private final ehg e;
   private final Optional<agi> f;
   private final List<efe> g;
   private final List<egk> h;
   private final BiFunction<clj, eex, clj> i;

   eff(ehg $$0, Optional<agi> $$1, List<efe> $$2, List<egk> $$3) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      this.i = egm.a($$3);
   }

   public static Consumer<clj> a(ame $$0, Consumer<clj> $$1) {
      return $$2 -> {
         if ($$2.a($$0.H())) {
            if ($$2.L() < $$2.g()) {
               $$1.accept($$2);
            } else {
               int $$3 = $$2.L();

               while ($$3 > 0) {
                  clj $$4 = $$2.c(Math.min($$2.g(), $$3));
                  $$3 -= $$4.L();
                  $$1.accept($$4);
               }
            }
         }
      };
   }

   public void a(efd $$0, Consumer<clj> $$1) {
      this.a(new eex.a($$0).a(this.f), $$1);
   }

   public void a(eex $$0, Consumer<clj> $$1) {
      eex.c<?> $$2 = eex.a(this);
      if ($$0.b($$2)) {
         Consumer<clj> $$3 = egk.a(this.i, $$1, $$0);

         for (efe $$4 : this.g) {
            $$4.a($$3, $$0);
         }

         $$0.c($$2);
      } else {
         d.warn("Detected infinite loop in loot tables");
      }
   }

   public void a(efd $$0, long $$1, Consumer<clj> $$2) {
      this.a(new eex.a($$0).a($$1).a(this.f), a($$0.a(), $$2));
   }

   public void b(efd $$0, Consumer<clj> $$1) {
      this.a($$0, a($$0.a(), $$1));
   }

   public void b(eex $$0, Consumer<clj> $$1) {
      this.a($$0, a($$0.d(), $$1));
   }

   public ObjectArrayList<clj> a(efd $$0, long $$1) {
      return this.a(new eex.a($$0).a($$1).a(this.f));
   }

   public ObjectArrayList<clj> a(efd $$0) {
      return this.a(new eex.a($$0).a(this.f));
   }

   private ObjectArrayList<clj> a(eex $$0) {
      ObjectArrayList<clj> $$1 = new ObjectArrayList();
      this.b($$0, $$1::add);
      return $$1;
   }

   public ehg a() {
      return this.e;
   }

   public void a(efg $$0) {
      for (int $$1 = 0; $$1 < this.g.size(); $$1++) {
         this.g.get($$1).a($$0.b(".pools[" + $$1 + "]"));
      }

      for (int $$2 = 0; $$2 < this.h.size(); $$2++) {
         this.h.get($$2).a($$0.b(".functions[" + $$2 + "]"));
      }
   }

   public void a(biq $$0, efd $$1, long $$2) {
      eex $$3 = new eex.a($$1).a($$2).a(this.f);
      ObjectArrayList<clj> $$4 = this.a($$3);
      ats $$5 = $$3.b();
      List<Integer> $$6 = this.a($$0, $$5);
      this.a($$4, $$6.size(), $$5);
      ObjectListIterator var9 = $$4.iterator();

      while (var9.hasNext()) {
         clj $$7 = (clj)var9.next();
         if ($$6.isEmpty()) {
            d.warn("Tried to over-fill a container");
            return;
         }

         if ($$7.b()) {
            $$0.a($$6.remove($$6.size() - 1), clj.b);
         } else {
            $$0.a($$6.remove($$6.size() - 1), $$7);
         }
      }
   }

   private void a(ObjectArrayList<clj> $$0, int $$1, ats $$2) {
      List<clj> $$3 = Lists.newArrayList();
      Iterator<clj> $$4 = $$0.iterator();

      while ($$4.hasNext()) {
         clj $$5 = $$4.next();
         if ($$5.b()) {
            $$4.remove();
         } else if ($$5.L() > 1) {
            $$3.add($$5);
            $$4.remove();
         }
      }

      while ($$1 - $$0.size() - $$3.size() > 0 && !$$3.isEmpty()) {
         clj $$6 = $$3.remove(atm.a($$2, 0, $$3.size() - 1));
         int $$7 = atm.a($$2, 1, $$6.L() / 2);
         clj $$8 = $$6.a($$7);
         if ($$6.L() > 1 && $$2.h()) {
            $$3.add($$6);
         } else {
            $$0.add($$6);
         }

         if ($$8.L() > 1 && $$2.h()) {
            $$3.add($$8);
         } else {
            $$0.add($$8);
         }
      }

      $$0.addAll($$3);
      ac.c($$0, $$2);
   }

   private List<Integer> a(biq $$0, ats $$1) {
      ObjectArrayList<Integer> $$2 = new ObjectArrayList();

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         if ($$0.a($$3).b()) {
            $$2.add($$3);
         }
      }

      ac.c($$2, $$1);
      return $$2;
   }

   public static eff.a b() {
      return new eff.a();
   }

   public static class a implements egh<eff.a> {
      private final Builder<efe> a = ImmutableList.builder();
      private final Builder<egk> b = ImmutableList.builder();
      private ehg c = eff.b;
      private Optional<agi> d = Optional.empty();

      public eff.a a(efe.a $$0) {
         this.a.add($$0.b());
         return this;
      }

      public eff.a a(ehg $$0) {
         this.c = $$0;
         return this;
      }

      public eff.a a(agi $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public eff.a a(egk.a $$0) {
         this.b.add($$0.b());
         return this;
      }

      public eff.a a() {
         return this;
      }

      public eff b() {
         return new eff(this.c, this.d, this.a.build(), this.b.build());
      }
   }
}
