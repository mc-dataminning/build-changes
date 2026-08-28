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

public class erw {
   private static final Logger f = LogUtils.getLogger();
   public static final erw a = new erw(eum.b, Optional.empty(), List.of(), List.of());
   public static final eul b = eum.q;
   public static final long c = 0L;
   public static final Codec<erw> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eum.a.lenientOptionalFieldOf("type", b).forGetter($$0x -> $$0x.g),
               akr.a.optionalFieldOf("random_sequence").forGetter($$0x -> $$0x.h),
               erv.a.listOf().optionalFieldOf("pools", List.of()).forGetter($$0x -> $$0x.i),
               eth.c.listOf().optionalFieldOf("functions", List.of()).forGetter($$0x -> $$0x.j)
            )
            .apply($$0, erw::new)
   );
   public static final Codec<jm<erw>> e = akn.a(lu.bc, d);
   private final eul g;
   private final Optional<akr> h;
   private final List<erv> i;
   private final List<etf> j;
   private final BiFunction<cuq, err, cuq> k;

   erw(eul $$0, Optional<akr> $$1, List<erv> $$2, List<etf> $$3) {
      this.g = $$0;
      this.h = $$1;
      this.i = $$2;
      this.j = $$3;
      this.k = eth.a($$3);
   }

   public static Consumer<cuq> a(aqu $$0, Consumer<cuq> $$1) {
      return $$2 -> {
         if ($$2.a($$0.J())) {
            if ($$2.H() < $$2.j()) {
               $$1.accept($$2);
            } else {
               int $$3 = $$2.H();

               while ($$3 > 0) {
                  cuq $$4 = $$2.c(Math.min($$2.j(), $$3));
                  $$3 -= $$4.H();
                  $$1.accept($$4);
               }
            }
         }
      };
   }

   public void a(eru $$0, Consumer<cuq> $$1) {
      this.a(new err.a($$0).a(this.h), $$1);
   }

   public void a(err $$0, Consumer<cuq> $$1) {
      err.c<?> $$2 = err.a(this);
      if ($$0.b($$2)) {
         Consumer<cuq> $$3 = etf.a(this.k, $$1, $$0);

         for (erv $$4 : this.i) {
            $$4.a($$3, $$0);
         }

         $$0.c($$2);
      } else {
         f.warn("Detected infinite loop in loot tables");
      }
   }

   public void a(eru $$0, long $$1, Consumer<cuq> $$2) {
      this.a(new err.a($$0).a($$1).a(this.h), a($$0.a(), $$2));
   }

   public void b(eru $$0, Consumer<cuq> $$1) {
      this.a($$0, a($$0.a(), $$1));
   }

   public void b(err $$0, Consumer<cuq> $$1) {
      this.a($$0, a($$0.d(), $$1));
   }

   public ObjectArrayList<cuq> a(eru $$0, ayw $$1) {
      return this.a(new err.a($$0).a($$1).a(this.h));
   }

   public ObjectArrayList<cuq> a(eru $$0, long $$1) {
      return this.a(new err.a($$0).a($$1).a(this.h));
   }

   public ObjectArrayList<cuq> a(eru $$0) {
      return this.a(new err.a($$0).a(this.h));
   }

   private ObjectArrayList<cuq> a(err $$0) {
      ObjectArrayList<cuq> $$1 = new ObjectArrayList();
      this.b($$0, $$1::add);
      return $$1;
   }

   public eul a() {
      return this.g;
   }

   public void a(erx $$0) {
      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         this.i.get($$1).a($$0.a(".pools[" + $$1 + "]"));
      }

      for (int $$2 = 0; $$2 < this.j.size(); $$2++) {
         this.j.get($$2).a($$0.a(".functions[" + $$2 + "]"));
      }
   }

   public void a(bqk $$0, eru $$1, long $$2) {
      err $$3 = new err.a($$1).a($$2).a(this.h);
      ObjectArrayList<cuq> $$4 = this.a($$3);
      ayw $$5 = $$3.b();
      List<Integer> $$6 = this.a($$0, $$5);
      this.a($$4, $$6.size(), $$5);
      ObjectListIterator var9 = $$4.iterator();

      while (var9.hasNext()) {
         cuq $$7 = (cuq)var9.next();
         if ($$6.isEmpty()) {
            f.warn("Tried to over-fill a container");
            return;
         }

         if ($$7.e()) {
            $$0.a($$6.remove($$6.size() - 1), cuq.l);
         } else {
            $$0.a($$6.remove($$6.size() - 1), $$7);
         }
      }
   }

   private void a(ObjectArrayList<cuq> $$0, int $$1, ayw $$2) {
      List<cuq> $$3 = Lists.newArrayList();
      Iterator<cuq> $$4 = $$0.iterator();

      while ($$4.hasNext()) {
         cuq $$5 = $$4.next();
         if ($$5.e()) {
            $$4.remove();
         } else if ($$5.H() > 1) {
            $$3.add($$5);
            $$4.remove();
         }
      }

      while ($$1 - $$0.size() - $$3.size() > 0 && !$$3.isEmpty()) {
         cuq $$6 = $$3.remove(ayo.a($$2, 0, $$3.size() - 1));
         int $$7 = ayo.a($$2, 1, $$6.H() / 2);
         cuq $$8 = $$6.a($$7);
         if ($$6.H() > 1 && $$2.h()) {
            $$3.add($$6);
         } else {
            $$0.add($$6);
         }

         if ($$8.H() > 1 && $$2.h()) {
            $$3.add($$8);
         } else {
            $$0.add($$8);
         }
      }

      $$0.addAll($$3);
      ad.c($$0, $$2);
   }

   private List<Integer> a(bqk $$0, ayw $$1) {
      ObjectArrayList<Integer> $$2 = new ObjectArrayList();

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         if ($$0.a($$3).e()) {
            $$2.add($$3);
         }
      }

      ad.c($$2, $$1);
      return $$2;
   }

   public static erw.a b() {
      return new erw.a();
   }

   public static class a implements etb<erw.a> {
      private final Builder<erv> a = ImmutableList.builder();
      private final Builder<etf> b = ImmutableList.builder();
      private eul c = erw.b;
      private Optional<akr> d = Optional.empty();

      public erw.a a(erv.a $$0) {
         this.a.add($$0.b());
         return this;
      }

      public erw.a a(eul $$0) {
         this.c = $$0;
         return this;
      }

      public erw.a a(akr $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public erw.a a(etf.a $$0) {
         this.b.add($$0.b());
         return this;
      }

      public erw.a a() {
         return this;
      }

      public erw b() {
         return new erw(this.c, this.d, this.a.build(), this.b.build());
      }
   }
}
