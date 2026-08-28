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

public class etq {
   private static final Logger f = LogUtils.getLogger();
   public static final etq a = new etq(ewg.b, Optional.empty(), List.of(), List.of());
   public static final ewf b = ewg.q;
   public static final long c = 0L;
   public static final Codec<etq> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ewg.a.lenientOptionalFieldOf("type", b).forGetter($$0x -> $$0x.g),
               ale.a.optionalFieldOf("random_sequence").forGetter($$0x -> $$0x.h),
               etp.a.listOf().optionalFieldOf("pools", List.of()).forGetter($$0x -> $$0x.i),
               evb.c.listOf().optionalFieldOf("functions", List.of()).forGetter($$0x -> $$0x.j)
            )
            .apply($$0, etq::new)
   );
   public static final Codec<jo<etq>> e = ala.a(lw.be, d);
   private final ewf g;
   private final Optional<ale> h;
   private final List<etp> i;
   private final List<euz> j;
   private final BiFunction<cvs, etl, cvs> k;

   etq(ewf $$0, Optional<ale> $$1, List<etp> $$2, List<euz> $$3) {
      this.g = $$0;
      this.h = $$1;
      this.i = $$2;
      this.j = $$3;
      this.k = evb.a($$3);
   }

   public static Consumer<cvs> a(arj $$0, Consumer<cvs> $$1) {
      return $$2 -> {
         if ($$2.a($$0.J())) {
            if ($$2.K() < $$2.k()) {
               $$1.accept($$2);
            } else {
               int $$3 = $$2.K();

               while ($$3 > 0) {
                  cvs $$4 = $$2.c(Math.min($$2.k(), $$3));
                  $$3 -= $$4.K();
                  $$1.accept($$4);
               }
            }
         }
      };
   }

   public void a(eto $$0, Consumer<cvs> $$1) {
      this.a(new etl.a($$0).a(this.h), $$1);
   }

   public void a(etl $$0, Consumer<cvs> $$1) {
      etl.c<?> $$2 = etl.a(this);
      if ($$0.b($$2)) {
         Consumer<cvs> $$3 = euz.a(this.k, $$1, $$0);

         for (etp $$4 : this.i) {
            $$4.a($$3, $$0);
         }

         $$0.c($$2);
      } else {
         f.warn("Detected infinite loop in loot tables");
      }
   }

   public void a(eto $$0, long $$1, Consumer<cvs> $$2) {
      this.a(new etl.a($$0).a($$1).a(this.h), a($$0.a(), $$2));
   }

   public void b(eto $$0, Consumer<cvs> $$1) {
      this.a($$0, a($$0.a(), $$1));
   }

   public void b(etl $$0, Consumer<cvs> $$1) {
      this.a($$0, a($$0.d(), $$1));
   }

   public ObjectArrayList<cvs> a(eto $$0, azn $$1) {
      return this.a(new etl.a($$0).a($$1).a(this.h));
   }

   public ObjectArrayList<cvs> a(eto $$0, long $$1) {
      return this.a(new etl.a($$0).a($$1).a(this.h));
   }

   public ObjectArrayList<cvs> a(eto $$0) {
      return this.a(new etl.a($$0).a(this.h));
   }

   private ObjectArrayList<cvs> a(etl $$0) {
      ObjectArrayList<cvs> $$1 = new ObjectArrayList();
      this.b($$0, $$1::add);
      return $$1;
   }

   public ewf a() {
      return this.g;
   }

   public void a(etr $$0) {
      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         this.i.get($$1).a($$0.a(".pools[" + $$1 + "]"));
      }

      for (int $$2 = 0; $$2 < this.j.size(); $$2++) {
         this.j.get($$2).a($$0.a(".functions[" + $$2 + "]"));
      }
   }

   public void a(brl $$0, eto $$1, long $$2) {
      etl $$3 = new etl.a($$1).a($$2).a(this.h);
      ObjectArrayList<cvs> $$4 = this.a($$3);
      azn $$5 = $$3.b();
      List<Integer> $$6 = this.a($$0, $$5);
      this.a($$4, $$6.size(), $$5);
      ObjectListIterator var9 = $$4.iterator();

      while (var9.hasNext()) {
         cvs $$7 = (cvs)var9.next();
         if ($$6.isEmpty()) {
            f.warn("Tried to over-fill a container");
            return;
         }

         if ($$7.f()) {
            $$0.a($$6.remove($$6.size() - 1), cvs.k);
         } else {
            $$0.a($$6.remove($$6.size() - 1), $$7);
         }
      }
   }

   private void a(ObjectArrayList<cvs> $$0, int $$1, azn $$2) {
      List<cvs> $$3 = Lists.newArrayList();
      Iterator<cvs> $$4 = $$0.iterator();

      while ($$4.hasNext()) {
         cvs $$5 = $$4.next();
         if ($$5.f()) {
            $$4.remove();
         } else if ($$5.K() > 1) {
            $$3.add($$5);
            $$4.remove();
         }
      }

      while ($$1 - $$0.size() - $$3.size() > 0 && !$$3.isEmpty()) {
         cvs $$6 = $$3.remove(azf.a($$2, 0, $$3.size() - 1));
         int $$7 = azf.a($$2, 1, $$6.K() / 2);
         cvs $$8 = $$6.a($$7);
         if ($$6.K() > 1 && $$2.h()) {
            $$3.add($$6);
         } else {
            $$0.add($$6);
         }

         if ($$8.K() > 1 && $$2.h()) {
            $$3.add($$8);
         } else {
            $$0.add($$8);
         }
      }

      $$0.addAll($$3);
      ad.c($$0, $$2);
   }

   private List<Integer> a(brl $$0, azn $$1) {
      ObjectArrayList<Integer> $$2 = new ObjectArrayList();

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         if ($$0.a($$3).f()) {
            $$2.add($$3);
         }
      }

      ad.c($$2, $$1);
      return $$2;
   }

   public static etq.a b() {
      return new etq.a();
   }

   public static class a implements euv<etq.a> {
      private final Builder<etp> a = ImmutableList.builder();
      private final Builder<euz> b = ImmutableList.builder();
      private ewf c = etq.b;
      private Optional<ale> d = Optional.empty();

      public etq.a a(etp.a $$0) {
         this.a.add($$0.b());
         return this;
      }

      public etq.a a(ewf $$0) {
         this.c = $$0;
         return this;
      }

      public etq.a a(ale $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public etq.a a(euz.a $$0) {
         this.b.add($$0.b());
         return this;
      }

      public etq.a a() {
         return this;
      }

      public etq b() {
         return new etq(this.c, this.d, this.a.build(), this.b.build());
      }
   }
}
