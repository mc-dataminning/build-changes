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

public class ehe {
   private static final Logger d = LogUtils.getLogger();
   public static final ehe a = new ehe(ejg.b, Optional.empty(), List.of(), List.of());
   public static final ejf b = ejg.n;
   public static final Codec<ehe> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ejg.a.optionalFieldOf("type", b).forGetter($$0x -> $$0x.e),
               atw.a(ahg.a, "random_sequence").forGetter($$0x -> $$0x.f),
               atw.a(ehd.a.listOf(), "pools", List.of()).forGetter($$0x -> $$0x.g),
               atw.a(eil.b.listOf(), "functions", List.of()).forGetter($$0x -> $$0x.h)
            )
            .apply($$0, ehe::new)
   );
   private final ejf e;
   private final Optional<ahg> f;
   private final List<ehd> g;
   private final List<eij> h;
   private final BiFunction<cmy, egw, cmy> i;

   ehe(ejf $$0, Optional<ahg> $$1, List<ehd> $$2, List<eij> $$3) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      this.i = eil.a($$3);
   }

   public static Consumer<cmy> a(and $$0, Consumer<cmy> $$1) {
      return $$2 -> {
         if ($$2.a($$0.I())) {
            if ($$2.L() < $$2.g()) {
               $$1.accept($$2);
            } else {
               int $$3 = $$2.L();

               while ($$3 > 0) {
                  cmy $$4 = $$2.c(Math.min($$2.g(), $$3));
                  $$3 -= $$4.L();
                  $$1.accept($$4);
               }
            }
         }
      };
   }

   public void a(ehc $$0, Consumer<cmy> $$1) {
      this.a(new egw.a($$0).a(this.f), $$1);
   }

   public void a(egw $$0, Consumer<cmy> $$1) {
      egw.c<?> $$2 = egw.a(this);
      if ($$0.b($$2)) {
         Consumer<cmy> $$3 = eij.a(this.i, $$1, $$0);

         for (ehd $$4 : this.g) {
            $$4.a($$3, $$0);
         }

         $$0.c($$2);
      } else {
         d.warn("Detected infinite loop in loot tables");
      }
   }

   public void a(ehc $$0, long $$1, Consumer<cmy> $$2) {
      this.a(new egw.a($$0).a($$1).a(this.f), a($$0.a(), $$2));
   }

   public void b(ehc $$0, Consumer<cmy> $$1) {
      this.a($$0, a($$0.a(), $$1));
   }

   public void b(egw $$0, Consumer<cmy> $$1) {
      this.a($$0, a($$0.d(), $$1));
   }

   public ObjectArrayList<cmy> a(ehc $$0, long $$1) {
      return this.a(new egw.a($$0).a($$1).a(this.f));
   }

   public ObjectArrayList<cmy> a(ehc $$0) {
      return this.a(new egw.a($$0).a(this.f));
   }

   private ObjectArrayList<cmy> a(egw $$0) {
      ObjectArrayList<cmy> $$1 = new ObjectArrayList();
      this.b($$0, $$1::add);
      return $$1;
   }

   public ejf a() {
      return this.e;
   }

   public void a(ehf $$0) {
      for (int $$1 = 0; $$1 < this.g.size(); $$1++) {
         this.g.get($$1).a($$0.a(".pools[" + $$1 + "]"));
      }

      for (int $$2 = 0; $$2 < this.h.size(); $$2++) {
         this.h.get($$2).a($$0.a(".functions[" + $$2 + "]"));
      }
   }

   public void a(bju $$0, ehc $$1, long $$2) {
      egw $$3 = new egw.a($$1).a($$2).a(this.f);
      ObjectArrayList<cmy> $$4 = this.a($$3);
      auv $$5 = $$3.b();
      List<Integer> $$6 = this.a($$0, $$5);
      this.a($$4, $$6.size(), $$5);
      ObjectListIterator var9 = $$4.iterator();

      while (var9.hasNext()) {
         cmy $$7 = (cmy)var9.next();
         if ($$6.isEmpty()) {
            d.warn("Tried to over-fill a container");
            return;
         }

         if ($$7.b()) {
            $$0.a($$6.remove($$6.size() - 1), cmy.f);
         } else {
            $$0.a($$6.remove($$6.size() - 1), $$7);
         }
      }
   }

   private void a(ObjectArrayList<cmy> $$0, int $$1, auv $$2) {
      List<cmy> $$3 = Lists.newArrayList();
      Iterator<cmy> $$4 = $$0.iterator();

      while ($$4.hasNext()) {
         cmy $$5 = $$4.next();
         if ($$5.b()) {
            $$4.remove();
         } else if ($$5.L() > 1) {
            $$3.add($$5);
            $$4.remove();
         }
      }

      while ($$1 - $$0.size() - $$3.size() > 0 && !$$3.isEmpty()) {
         cmy $$6 = $$3.remove(auo.a($$2, 0, $$3.size() - 1));
         int $$7 = auo.a($$2, 1, $$6.L() / 2);
         cmy $$8 = $$6.a($$7);
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

   private List<Integer> a(bju $$0, auv $$1) {
      ObjectArrayList<Integer> $$2 = new ObjectArrayList();

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         if ($$0.a($$3).b()) {
            $$2.add($$3);
         }
      }

      ac.c($$2, $$1);
      return $$2;
   }

   public static ehe.a b() {
      return new ehe.a();
   }

   public static class a implements eig<ehe.a> {
      private final Builder<ehd> a = ImmutableList.builder();
      private final Builder<eij> b = ImmutableList.builder();
      private ejf c = ehe.b;
      private Optional<ahg> d = Optional.empty();

      public ehe.a a(ehd.a $$0) {
         this.a.add($$0.b());
         return this;
      }

      public ehe.a a(ejf $$0) {
         this.c = $$0;
         return this;
      }

      public ehe.a a(ahg $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public ehe.a a(eij.a $$0) {
         this.b.add($$0.b());
         return this;
      }

      public ehe.a a() {
         return this;
      }

      public ehe b() {
         return new ehe(this.c, this.d, this.a.build(), this.b.build());
      }
   }
}
