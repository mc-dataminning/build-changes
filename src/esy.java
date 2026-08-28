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

public class esy {
   private static final Logger f = LogUtils.getLogger();
   public static final esy a = new esy(evo.b, Optional.empty(), List.of(), List.of());
   public static final evn b = evo.q;
   public static final long c = 0L;
   public static final Codec<esy> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               evo.a.lenientOptionalFieldOf("type", b).forGetter($$0x -> $$0x.g),
               alb.a.optionalFieldOf("random_sequence").forGetter($$0x -> $$0x.h),
               esx.a.listOf().optionalFieldOf("pools", List.of()).forGetter($$0x -> $$0x.i),
               euj.c.listOf().optionalFieldOf("functions", List.of()).forGetter($$0x -> $$0x.j)
            )
            .apply($$0, esy::new)
   );
   public static final Codec<jn<esy>> e = akx.a(lv.bc, d);
   private final evn g;
   private final Optional<alb> h;
   private final List<esx> i;
   private final List<euh> j;
   private final BiFunction<cvl, est, cvl> k;

   esy(evn $$0, Optional<alb> $$1, List<esx> $$2, List<euh> $$3) {
      this.g = $$0;
      this.h = $$1;
      this.i = $$2;
      this.j = $$3;
      this.k = euj.a($$3);
   }

   public static Consumer<cvl> a(arg $$0, Consumer<cvl> $$1) {
      return $$2 -> {
         if ($$2.a($$0.J())) {
            if ($$2.J() < $$2.k()) {
               $$1.accept($$2);
            } else {
               int $$3 = $$2.J();

               while ($$3 > 0) {
                  cvl $$4 = $$2.c(Math.min($$2.k(), $$3));
                  $$3 -= $$4.J();
                  $$1.accept($$4);
               }
            }
         }
      };
   }

   public void a(esw $$0, Consumer<cvl> $$1) {
      this.a(new est.a($$0).a(this.h), $$1);
   }

   public void a(est $$0, Consumer<cvl> $$1) {
      est.c<?> $$2 = est.a(this);
      if ($$0.b($$2)) {
         Consumer<cvl> $$3 = euh.a(this.k, $$1, $$0);

         for (esx $$4 : this.i) {
            $$4.a($$3, $$0);
         }

         $$0.c($$2);
      } else {
         f.warn("Detected infinite loop in loot tables");
      }
   }

   public void a(esw $$0, long $$1, Consumer<cvl> $$2) {
      this.a(new est.a($$0).a($$1).a(this.h), a($$0.a(), $$2));
   }

   public void b(esw $$0, Consumer<cvl> $$1) {
      this.a($$0, a($$0.a(), $$1));
   }

   public void b(est $$0, Consumer<cvl> $$1) {
      this.a($$0, a($$0.d(), $$1));
   }

   public ObjectArrayList<cvl> a(esw $$0, azk $$1) {
      return this.a(new est.a($$0).a($$1).a(this.h));
   }

   public ObjectArrayList<cvl> a(esw $$0, long $$1) {
      return this.a(new est.a($$0).a($$1).a(this.h));
   }

   public ObjectArrayList<cvl> a(esw $$0) {
      return this.a(new est.a($$0).a(this.h));
   }

   private ObjectArrayList<cvl> a(est $$0) {
      ObjectArrayList<cvl> $$1 = new ObjectArrayList();
      this.b($$0, $$1::add);
      return $$1;
   }

   public evn a() {
      return this.g;
   }

   public void a(esz $$0) {
      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         this.i.get($$1).a($$0.a(".pools[" + $$1 + "]"));
      }

      for (int $$2 = 0; $$2 < this.j.size(); $$2++) {
         this.j.get($$2).a($$0.a(".functions[" + $$2 + "]"));
      }
   }

   public void a(brd $$0, esw $$1, long $$2) {
      est $$3 = new est.a($$1).a($$2).a(this.h);
      ObjectArrayList<cvl> $$4 = this.a($$3);
      azk $$5 = $$3.b();
      List<Integer> $$6 = this.a($$0, $$5);
      this.a($$4, $$6.size(), $$5);
      ObjectListIterator var9 = $$4.iterator();

      while (var9.hasNext()) {
         cvl $$7 = (cvl)var9.next();
         if ($$6.isEmpty()) {
            f.warn("Tried to over-fill a container");
            return;
         }

         if ($$7.f()) {
            $$0.a($$6.remove($$6.size() - 1), cvl.k);
         } else {
            $$0.a($$6.remove($$6.size() - 1), $$7);
         }
      }
   }

   private void a(ObjectArrayList<cvl> $$0, int $$1, azk $$2) {
      List<cvl> $$3 = Lists.newArrayList();
      Iterator<cvl> $$4 = $$0.iterator();

      while ($$4.hasNext()) {
         cvl $$5 = $$4.next();
         if ($$5.f()) {
            $$4.remove();
         } else if ($$5.J() > 1) {
            $$3.add($$5);
            $$4.remove();
         }
      }

      while ($$1 - $$0.size() - $$3.size() > 0 && !$$3.isEmpty()) {
         cvl $$6 = $$3.remove(azc.a($$2, 0, $$3.size() - 1));
         int $$7 = azc.a($$2, 1, $$6.J() / 2);
         cvl $$8 = $$6.a($$7);
         if ($$6.J() > 1 && $$2.h()) {
            $$3.add($$6);
         } else {
            $$0.add($$6);
         }

         if ($$8.J() > 1 && $$2.h()) {
            $$3.add($$8);
         } else {
            $$0.add($$8);
         }
      }

      $$0.addAll($$3);
      ad.c($$0, $$2);
   }

   private List<Integer> a(brd $$0, azk $$1) {
      ObjectArrayList<Integer> $$2 = new ObjectArrayList();

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         if ($$0.a($$3).f()) {
            $$2.add($$3);
         }
      }

      ad.c($$2, $$1);
      return $$2;
   }

   public static esy.a b() {
      return new esy.a();
   }

   public static class a implements eud<esy.a> {
      private final Builder<esx> a = ImmutableList.builder();
      private final Builder<euh> b = ImmutableList.builder();
      private evn c = esy.b;
      private Optional<alb> d = Optional.empty();

      public esy.a a(esx.a $$0) {
         this.a.add($$0.b());
         return this;
      }

      public esy.a a(evn $$0) {
         this.c = $$0;
         return this;
      }

      public esy.a a(alb $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public esy.a a(euh.a $$0) {
         this.b.add($$0.b());
         return this;
      }

      public esy.a a() {
         return this;
      }

      public esy b() {
         return new esy(this.c, this.d, this.a.build(), this.b.build());
      }
   }
}
