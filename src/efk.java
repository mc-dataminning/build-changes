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

public class efk {
   private static final Logger d = LogUtils.getLogger();
   public static final efk a = new efk(ehm.b, Optional.empty(), List.of(), List.of());
   public static final ehl b = ehm.n;
   public static final Codec<efk> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ehm.a.optionalFieldOf("type", b).forGetter($$0x -> $$0x.e),
               asy.a(agm.a, "random_sequence").forGetter($$0x -> $$0x.f),
               asy.a(efj.a.listOf(), "pools", List.of()).forGetter($$0x -> $$0x.g),
               asy.a(egr.b.listOf(), "functions", List.of()).forGetter($$0x -> $$0x.h)
            )
            .apply($$0, efk::new)
   );
   private final ehl e;
   private final Optional<agm> f;
   private final List<efj> g;
   private final List<egp> h;
   private final BiFunction<clo, efc, clo> i;

   efk(ehl $$0, Optional<agm> $$1, List<efj> $$2, List<egp> $$3) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      this.i = egr.a($$3);
   }

   public static Consumer<clo> a(ami $$0, Consumer<clo> $$1) {
      return $$2 -> {
         if ($$2.a($$0.H())) {
            if ($$2.L() < $$2.g()) {
               $$1.accept($$2);
            } else {
               int $$3 = $$2.L();

               while ($$3 > 0) {
                  clo $$4 = $$2.c(Math.min($$2.g(), $$3));
                  $$3 -= $$4.L();
                  $$1.accept($$4);
               }
            }
         }
      };
   }

   public void a(efi $$0, Consumer<clo> $$1) {
      this.a(new efc.a($$0).a(this.f), $$1);
   }

   public void a(efc $$0, Consumer<clo> $$1) {
      efc.c<?> $$2 = efc.a(this);
      if ($$0.b($$2)) {
         Consumer<clo> $$3 = egp.a(this.i, $$1, $$0);

         for (efj $$4 : this.g) {
            $$4.a($$3, $$0);
         }

         $$0.c($$2);
      } else {
         d.warn("Detected infinite loop in loot tables");
      }
   }

   public void a(efi $$0, long $$1, Consumer<clo> $$2) {
      this.a(new efc.a($$0).a($$1).a(this.f), a($$0.a(), $$2));
   }

   public void b(efi $$0, Consumer<clo> $$1) {
      this.a($$0, a($$0.a(), $$1));
   }

   public void b(efc $$0, Consumer<clo> $$1) {
      this.a($$0, a($$0.d(), $$1));
   }

   public ObjectArrayList<clo> a(efi $$0, long $$1) {
      return this.a(new efc.a($$0).a($$1).a(this.f));
   }

   public ObjectArrayList<clo> a(efi $$0) {
      return this.a(new efc.a($$0).a(this.f));
   }

   private ObjectArrayList<clo> a(efc $$0) {
      ObjectArrayList<clo> $$1 = new ObjectArrayList();
      this.b($$0, $$1::add);
      return $$1;
   }

   public ehl a() {
      return this.e;
   }

   public void a(efl $$0) {
      for (int $$1 = 0; $$1 < this.g.size(); $$1++) {
         this.g.get($$1).a($$0.b(".pools[" + $$1 + "]"));
      }

      for (int $$2 = 0; $$2 < this.h.size(); $$2++) {
         this.h.get($$2).a($$0.b(".functions[" + $$2 + "]"));
      }
   }

   public void a(biu $$0, efi $$1, long $$2) {
      efc $$3 = new efc.a($$1).a($$2).a(this.f);
      ObjectArrayList<clo> $$4 = this.a($$3);
      atw $$5 = $$3.b();
      List<Integer> $$6 = this.a($$0, $$5);
      this.a($$4, $$6.size(), $$5);
      ObjectListIterator var9 = $$4.iterator();

      while (var9.hasNext()) {
         clo $$7 = (clo)var9.next();
         if ($$6.isEmpty()) {
            d.warn("Tried to over-fill a container");
            return;
         }

         if ($$7.b()) {
            $$0.a($$6.remove($$6.size() - 1), clo.b);
         } else {
            $$0.a($$6.remove($$6.size() - 1), $$7);
         }
      }
   }

   private void a(ObjectArrayList<clo> $$0, int $$1, atw $$2) {
      List<clo> $$3 = Lists.newArrayList();
      Iterator<clo> $$4 = $$0.iterator();

      while ($$4.hasNext()) {
         clo $$5 = $$4.next();
         if ($$5.b()) {
            $$4.remove();
         } else if ($$5.L() > 1) {
            $$3.add($$5);
            $$4.remove();
         }
      }

      while ($$1 - $$0.size() - $$3.size() > 0 && !$$3.isEmpty()) {
         clo $$6 = $$3.remove(atq.a($$2, 0, $$3.size() - 1));
         int $$7 = atq.a($$2, 1, $$6.L() / 2);
         clo $$8 = $$6.a($$7);
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

   private List<Integer> a(biu $$0, atw $$1) {
      ObjectArrayList<Integer> $$2 = new ObjectArrayList();

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         if ($$0.a($$3).b()) {
            $$2.add($$3);
         }
      }

      ac.c($$2, $$1);
      return $$2;
   }

   public static efk.a b() {
      return new efk.a();
   }

   public static class a implements egm<efk.a> {
      private final Builder<efj> a = ImmutableList.builder();
      private final Builder<egp> b = ImmutableList.builder();
      private ehl c = efk.b;
      private Optional<agm> d = Optional.empty();

      public efk.a a(efj.a $$0) {
         this.a.add($$0.b());
         return this;
      }

      public efk.a a(ehl $$0) {
         this.c = $$0;
         return this;
      }

      public efk.a a(agm $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public efk.a a(egp.a $$0) {
         this.b.add($$0.b());
         return this;
      }

      public efk.a a() {
         return this;
      }

      public efk b() {
         return new efk(this.c, this.d, this.a.build(), this.b.build());
      }
   }
}
