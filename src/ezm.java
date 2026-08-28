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

public class ezm {
   private static final Logger f = LogUtils.getLogger();
   public static final ezm a = new ezm(fca.b, Optional.empty(), List.of(), List.of());
   public static final bay b = fca.q;
   public static final long c = 0L;
   public static final Codec<ezm> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               fca.a.lenientOptionalFieldOf("type", b).forGetter($$0x -> $$0x.g),
               alg.a.optionalFieldOf("random_sequence").forGetter($$0x -> $$0x.h),
               ezl.a.listOf().optionalFieldOf("pools", List.of()).forGetter($$0x -> $$0x.i),
               fax.c.listOf().optionalFieldOf("functions", List.of()).forGetter($$0x -> $$0x.j)
            )
            .apply($$0, ezm::new)
   );
   public static final Codec<je<ezm>> e = alc.a(mg.bq, d);
   private final bay g;
   private final Optional<alg> h;
   private final List<ezl> i;
   private final List<fav> j;
   private final BiFunction<czd, ezh, czd> k;

   ezm(bay $$0, Optional<alg> $$1, List<ezl> $$2, List<fav> $$3) {
      this.g = $$0;
      this.h = $$1;
      this.i = $$2;
      this.j = $$3;
      this.k = fax.a($$3);
   }

   public static Consumer<czd> a(arq $$0, Consumer<czd> $$1) {
      return $$2 -> {
         if ($$2.a($$0.K())) {
            if ($$2.M() < $$2.k()) {
               $$1.accept($$2);
            } else {
               int $$3 = $$2.M();

               while ($$3 > 0) {
                  czd $$4 = $$2.c(Math.min($$2.k(), $$3));
                  $$3 -= $$4.M();
                  $$1.accept($$4);
               }
            }
         }
      };
   }

   public void a(ezk $$0, Consumer<czd> $$1) {
      this.a(new ezh.a($$0).a(this.h), $$1);
   }

   public void a(ezh $$0, Consumer<czd> $$1) {
      ezh.c<?> $$2 = ezh.a(this);
      if ($$0.b($$2)) {
         Consumer<czd> $$3 = fav.a(this.k, $$1, $$0);

         for (ezl $$4 : this.i) {
            $$4.a($$3, $$0);
         }

         $$0.c($$2);
      } else {
         f.warn("Detected infinite loop in loot tables");
      }
   }

   public void a(ezk $$0, long $$1, Consumer<czd> $$2) {
      this.a(new ezh.a($$0).a($$1).a(this.h), a($$0.a(), $$2));
   }

   public void b(ezk $$0, Consumer<czd> $$1) {
      this.a($$0, a($$0.a(), $$1));
   }

   public void b(ezh $$0, Consumer<czd> $$1) {
      this.a($$0, a($$0.d(), $$1));
   }

   public ObjectArrayList<czd> a(ezk $$0, azv $$1) {
      return this.a(new ezh.a($$0).a($$1).a(this.h));
   }

   public ObjectArrayList<czd> a(ezk $$0, long $$1) {
      return this.a(new ezh.a($$0).a($$1).a(this.h));
   }

   public ObjectArrayList<czd> a(ezk $$0) {
      return this.a(new ezh.a($$0).a(this.h));
   }

   private ObjectArrayList<czd> a(ezh $$0) {
      ObjectArrayList<czd> $$1 = new ObjectArrayList();
      this.b($$0, $$1::add);
      return $$1;
   }

   public bay a() {
      return this.g;
   }

   public void a(ezn $$0) {
      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         this.i.get($$1).a($$0.a(".pools[" + $$1 + "]"));
      }

      for (int $$2 = 0; $$2 < this.j.size(); $$2++) {
         this.j.get($$2).a($$0.a(".functions[" + $$2 + "]"));
      }
   }

   public void a(btw $$0, ezk $$1, long $$2) {
      ezh $$3 = new ezh.a($$1).a($$2).a(this.h);
      ObjectArrayList<czd> $$4 = this.a($$3);
      azv $$5 = $$3.b();
      List<Integer> $$6 = this.a($$0, $$5);
      this.a($$4, $$6.size(), $$5);
      ObjectListIterator var9 = $$4.iterator();

      while (var9.hasNext()) {
         czd $$7 = (czd)var9.next();
         if ($$6.isEmpty()) {
            f.warn("Tried to over-fill a container");
            return;
         }

         if ($$7.f()) {
            $$0.a($$6.remove($$6.size() - 1), czd.k);
         } else {
            $$0.a($$6.remove($$6.size() - 1), $$7);
         }
      }
   }

   private void a(ObjectArrayList<czd> $$0, int $$1, azv $$2) {
      List<czd> $$3 = Lists.newArrayList();
      Iterator<czd> $$4 = $$0.iterator();

      while ($$4.hasNext()) {
         czd $$5 = $$4.next();
         if ($$5.f()) {
            $$4.remove();
         } else if ($$5.M() > 1) {
            $$3.add($$5);
            $$4.remove();
         }
      }

      while ($$1 - $$0.size() - $$3.size() > 0 && !$$3.isEmpty()) {
         czd $$6 = $$3.remove(azm.a($$2, 0, $$3.size() - 1));
         int $$7 = azm.a($$2, 1, $$6.M() / 2);
         czd $$8 = $$6.a($$7);
         if ($$6.M() > 1 && $$2.h()) {
            $$3.add($$6);
         } else {
            $$0.add($$6);
         }

         if ($$8.M() > 1 && $$2.h()) {
            $$3.add($$8);
         } else {
            $$0.add($$8);
         }
      }

      $$0.addAll($$3);
      af.c($$0, $$2);
   }

   private List<Integer> a(btw $$0, azv $$1) {
      ObjectArrayList<Integer> $$2 = new ObjectArrayList();

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         if ($$0.a($$3).f()) {
            $$2.add($$3);
         }
      }

      af.c($$2, $$1);
      return $$2;
   }

   public static ezm.a b() {
      return new ezm.a();
   }

   public static class a implements far<ezm.a> {
      private final Builder<ezl> a = ImmutableList.builder();
      private final Builder<fav> b = ImmutableList.builder();
      private bay c = ezm.b;
      private Optional<alg> d = Optional.empty();

      public ezm.a a(ezl.a $$0) {
         this.a.add($$0.b());
         return this;
      }

      public ezm.a a(bay $$0) {
         this.c = $$0;
         return this;
      }

      public ezm.a a(alg $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public ezm.a a(fav.a $$0) {
         this.b.add($$0.b());
         return this;
      }

      public ezm.a a() {
         return this;
      }

      public ezm b() {
         return new ezm(this.c, this.d, this.a.build(), this.b.build());
      }
   }
}
