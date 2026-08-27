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

public class ehd {
   private static final Logger d = LogUtils.getLogger();
   public static final ehd a = new ehd(ejf.b, Optional.empty(), List.of(), List.of());
   public static final eje b = ejf.n;
   public static final Codec<ehd> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ejf.a.optionalFieldOf("type", b).forGetter($$0x -> $$0x.e),
               atv.a(ahg.a, "random_sequence").forGetter($$0x -> $$0x.f),
               atv.a(ehc.a.listOf(), "pools", List.of()).forGetter($$0x -> $$0x.g),
               atv.a(eik.b.listOf(), "functions", List.of()).forGetter($$0x -> $$0x.h)
            )
            .apply($$0, ehd::new)
   );
   private final eje e;
   private final Optional<ahg> f;
   private final List<ehc> g;
   private final List<eii> h;
   private final BiFunction<cmx, egv, cmx> i;

   ehd(eje $$0, Optional<ahg> $$1, List<ehc> $$2, List<eii> $$3) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      this.i = eik.a($$3);
   }

   public static Consumer<cmx> a(and $$0, Consumer<cmx> $$1) {
      return $$2 -> {
         if ($$2.a($$0.I())) {
            if ($$2.L() < $$2.g()) {
               $$1.accept($$2);
            } else {
               int $$3 = $$2.L();

               while ($$3 > 0) {
                  cmx $$4 = $$2.c(Math.min($$2.g(), $$3));
                  $$3 -= $$4.L();
                  $$1.accept($$4);
               }
            }
         }
      };
   }

   public void a(ehb $$0, Consumer<cmx> $$1) {
      this.a(new egv.a($$0).a(this.f), $$1);
   }

   public void a(egv $$0, Consumer<cmx> $$1) {
      egv.c<?> $$2 = egv.a(this);
      if ($$0.b($$2)) {
         Consumer<cmx> $$3 = eii.a(this.i, $$1, $$0);

         for (ehc $$4 : this.g) {
            $$4.a($$3, $$0);
         }

         $$0.c($$2);
      } else {
         d.warn("Detected infinite loop in loot tables");
      }
   }

   public void a(ehb $$0, long $$1, Consumer<cmx> $$2) {
      this.a(new egv.a($$0).a($$1).a(this.f), a($$0.a(), $$2));
   }

   public void b(ehb $$0, Consumer<cmx> $$1) {
      this.a($$0, a($$0.a(), $$1));
   }

   public void b(egv $$0, Consumer<cmx> $$1) {
      this.a($$0, a($$0.d(), $$1));
   }

   public ObjectArrayList<cmx> a(ehb $$0, long $$1) {
      return this.a(new egv.a($$0).a($$1).a(this.f));
   }

   public ObjectArrayList<cmx> a(ehb $$0) {
      return this.a(new egv.a($$0).a(this.f));
   }

   private ObjectArrayList<cmx> a(egv $$0) {
      ObjectArrayList<cmx> $$1 = new ObjectArrayList();
      this.b($$0, $$1::add);
      return $$1;
   }

   public eje a() {
      return this.e;
   }

   public void a(ehe $$0) {
      for (int $$1 = 0; $$1 < this.g.size(); $$1++) {
         this.g.get($$1).a($$0.a(".pools[" + $$1 + "]"));
      }

      for (int $$2 = 0; $$2 < this.h.size(); $$2++) {
         this.h.get($$2).a($$0.a(".functions[" + $$2 + "]"));
      }
   }

   public void a(bjt $$0, ehb $$1, long $$2) {
      egv $$3 = new egv.a($$1).a($$2).a(this.f);
      ObjectArrayList<cmx> $$4 = this.a($$3);
      auu $$5 = $$3.b();
      List<Integer> $$6 = this.a($$0, $$5);
      this.a($$4, $$6.size(), $$5);
      ObjectListIterator var9 = $$4.iterator();

      while (var9.hasNext()) {
         cmx $$7 = (cmx)var9.next();
         if ($$6.isEmpty()) {
            d.warn("Tried to over-fill a container");
            return;
         }

         if ($$7.b()) {
            $$0.a($$6.remove($$6.size() - 1), cmx.f);
         } else {
            $$0.a($$6.remove($$6.size() - 1), $$7);
         }
      }
   }

   private void a(ObjectArrayList<cmx> $$0, int $$1, auu $$2) {
      List<cmx> $$3 = Lists.newArrayList();
      Iterator<cmx> $$4 = $$0.iterator();

      while ($$4.hasNext()) {
         cmx $$5 = $$4.next();
         if ($$5.b()) {
            $$4.remove();
         } else if ($$5.L() > 1) {
            $$3.add($$5);
            $$4.remove();
         }
      }

      while ($$1 - $$0.size() - $$3.size() > 0 && !$$3.isEmpty()) {
         cmx $$6 = $$3.remove(aun.a($$2, 0, $$3.size() - 1));
         int $$7 = aun.a($$2, 1, $$6.L() / 2);
         cmx $$8 = $$6.a($$7);
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

   private List<Integer> a(bjt $$0, auu $$1) {
      ObjectArrayList<Integer> $$2 = new ObjectArrayList();

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         if ($$0.a($$3).b()) {
            $$2.add($$3);
         }
      }

      ac.c($$2, $$1);
      return $$2;
   }

   public static ehd.a b() {
      return new ehd.a();
   }

   public static class a implements eif<ehd.a> {
      private final Builder<ehc> a = ImmutableList.builder();
      private final Builder<eii> b = ImmutableList.builder();
      private eje c = ehd.b;
      private Optional<ahg> d = Optional.empty();

      public ehd.a a(ehc.a $$0) {
         this.a.add($$0.b());
         return this;
      }

      public ehd.a a(eje $$0) {
         this.c = $$0;
         return this;
      }

      public ehd.a a(ahg $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public ehd.a a(eii.a $$0) {
         this.b.add($$0.b());
         return this;
      }

      public ehd.a a() {
         return this;
      }

      public ehd b() {
         return new ehd(this.c, this.d, this.a.build(), this.b.build());
      }
   }
}
