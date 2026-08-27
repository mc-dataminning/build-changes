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

public class egx {
   private static final Logger d = LogUtils.getLogger();
   public static final egx a = new egx(eiz.b, Optional.empty(), List.of(), List.of());
   public static final eiy b = eiz.n;
   public static final Codec<egx> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eiz.a.optionalFieldOf("type", b).forGetter($$0x -> $$0x.e),
               atq.a(ahd.a, "random_sequence").forGetter($$0x -> $$0x.f),
               atq.a(egw.a.listOf(), "pools", List.of()).forGetter($$0x -> $$0x.g),
               atq.a(eie.b.listOf(), "functions", List.of()).forGetter($$0x -> $$0x.h)
            )
            .apply($$0, egx::new)
   );
   private final eiy e;
   private final Optional<ahd> f;
   private final List<egw> g;
   private final List<eic> h;
   private final BiFunction<cmr, egp, cmr> i;

   egx(eiy $$0, Optional<ahd> $$1, List<egw> $$2, List<eic> $$3) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      this.i = eie.a($$3);
   }

   public static Consumer<cmr> a(amz $$0, Consumer<cmr> $$1) {
      return $$2 -> {
         if ($$2.a($$0.I())) {
            if ($$2.L() < $$2.g()) {
               $$1.accept($$2);
            } else {
               int $$3 = $$2.L();

               while ($$3 > 0) {
                  cmr $$4 = $$2.c(Math.min($$2.g(), $$3));
                  $$3 -= $$4.L();
                  $$1.accept($$4);
               }
            }
         }
      };
   }

   public void a(egv $$0, Consumer<cmr> $$1) {
      this.a(new egp.a($$0).a(this.f), $$1);
   }

   public void a(egp $$0, Consumer<cmr> $$1) {
      egp.c<?> $$2 = egp.a(this);
      if ($$0.b($$2)) {
         Consumer<cmr> $$3 = eic.a(this.i, $$1, $$0);

         for (egw $$4 : this.g) {
            $$4.a($$3, $$0);
         }

         $$0.c($$2);
      } else {
         d.warn("Detected infinite loop in loot tables");
      }
   }

   public void a(egv $$0, long $$1, Consumer<cmr> $$2) {
      this.a(new egp.a($$0).a($$1).a(this.f), a($$0.a(), $$2));
   }

   public void b(egv $$0, Consumer<cmr> $$1) {
      this.a($$0, a($$0.a(), $$1));
   }

   public void b(egp $$0, Consumer<cmr> $$1) {
      this.a($$0, a($$0.d(), $$1));
   }

   public ObjectArrayList<cmr> a(egv $$0, long $$1) {
      return this.a(new egp.a($$0).a($$1).a(this.f));
   }

   public ObjectArrayList<cmr> a(egv $$0) {
      return this.a(new egp.a($$0).a(this.f));
   }

   private ObjectArrayList<cmr> a(egp $$0) {
      ObjectArrayList<cmr> $$1 = new ObjectArrayList();
      this.b($$0, $$1::add);
      return $$1;
   }

   public eiy a() {
      return this.e;
   }

   public void a(egy $$0) {
      for (int $$1 = 0; $$1 < this.g.size(); $$1++) {
         this.g.get($$1).a($$0.a(".pools[" + $$1 + "]"));
      }

      for (int $$2 = 0; $$2 < this.h.size(); $$2++) {
         this.h.get($$2).a($$0.a(".functions[" + $$2 + "]"));
      }
   }

   public void a(bjo $$0, egv $$1, long $$2) {
      egp $$3 = new egp.a($$1).a($$2).a(this.f);
      ObjectArrayList<cmr> $$4 = this.a($$3);
      aup $$5 = $$3.b();
      List<Integer> $$6 = this.a($$0, $$5);
      this.a($$4, $$6.size(), $$5);
      ObjectListIterator var9 = $$4.iterator();

      while (var9.hasNext()) {
         cmr $$7 = (cmr)var9.next();
         if ($$6.isEmpty()) {
            d.warn("Tried to over-fill a container");
            return;
         }

         if ($$7.b()) {
            $$0.a($$6.remove($$6.size() - 1), cmr.f);
         } else {
            $$0.a($$6.remove($$6.size() - 1), $$7);
         }
      }
   }

   private void a(ObjectArrayList<cmr> $$0, int $$1, aup $$2) {
      List<cmr> $$3 = Lists.newArrayList();
      Iterator<cmr> $$4 = $$0.iterator();

      while ($$4.hasNext()) {
         cmr $$5 = $$4.next();
         if ($$5.b()) {
            $$4.remove();
         } else if ($$5.L() > 1) {
            $$3.add($$5);
            $$4.remove();
         }
      }

      while ($$1 - $$0.size() - $$3.size() > 0 && !$$3.isEmpty()) {
         cmr $$6 = $$3.remove(aui.a($$2, 0, $$3.size() - 1));
         int $$7 = aui.a($$2, 1, $$6.L() / 2);
         cmr $$8 = $$6.a($$7);
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

   private List<Integer> a(bjo $$0, aup $$1) {
      ObjectArrayList<Integer> $$2 = new ObjectArrayList();

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         if ($$0.a($$3).b()) {
            $$2.add($$3);
         }
      }

      ac.c($$2, $$1);
      return $$2;
   }

   public static egx.a b() {
      return new egx.a();
   }

   public static class a implements ehz<egx.a> {
      private final Builder<egw> a = ImmutableList.builder();
      private final Builder<eic> b = ImmutableList.builder();
      private eiy c = egx.b;
      private Optional<ahd> d = Optional.empty();

      public egx.a a(egw.a $$0) {
         this.a.add($$0.b());
         return this;
      }

      public egx.a a(eiy $$0) {
         this.c = $$0;
         return this;
      }

      public egx.a a(ahd $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public egx.a a(eic.a $$0) {
         this.b.add($$0.b());
         return this;
      }

      public egx.a a() {
         return this;
      }

      public egx b() {
         return new egx(this.c, this.d, this.a.build(), this.b.build());
      }
   }
}
