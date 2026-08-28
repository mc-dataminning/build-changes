import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public class cvk extends cty {
   private static final Map<bsn<? extends bte>, cvk> a = Maps.newIdentityHashMap();
   private static final MapCodec<bsn<?>> b = lq.f.r().fieldOf("id");
   private final int c;
   private final int j;
   private final bsn<?> k;

   public cvk(bsn<? extends bte> $$0, int $$1, int $$2, cty.a $$3) {
      super($$3);
      this.k = $$0;
      this.c = $$1;
      this.j = $$2;
      a.put($$0, this);
   }

   @Override
   public bqh a(cxp $$0) {
      dcg $$1 = $$0.q();
      if (!($$1 instanceof aqm)) {
         return bqh.a;
      } else {
         cud $$2 = $$0.n();
         ja $$3 = $$0.a();
         jf $$4 = $$0.k();
         dsl $$5 = $$1.a_($$3);
         if ($$1.c_($$3) instanceof dcz $$6) {
            bsn<?> $$7 = this.i($$2);
            $$6.a($$7, $$1.E_());
            $$1.a($$3, $$5, $$5, 3);
            $$1.a($$0.o(), dxh.c, $$3);
            $$2.h(1);
            return bqh.c;
         } else {
            ja $$8;
            if ($$5.k($$1, $$3).c()) {
               $$8 = $$3;
            } else {
               $$8 = $$3.a($$4);
            }

            bsn<?> $$10 = this.i($$2);
            if ($$10.a((aqm)$$1, $$2, $$0.o(), $$8, btg.m, true, !Objects.equals($$3, $$8) && $$4 == jf.b) != null) {
               $$2.h(1);
               $$1.a($$0.o(), dxh.t, $$3);
            }

            return bqh.c;
         }
      }
   }

   @Override
   public bqi<cud> a(dcg $$0, cml $$1, bqg $$2) {
      cud $$3 = $$1.b($$2);
      ewd $$4 = a($$0, $$1, dbp.b.b);
      if ($$4.c() != ewf.a.b) {
         return bqi.c($$3);
      } else if (!($$0 instanceof aqm)) {
         return bqi.a($$3);
      } else {
         ja $$6 = $$4.a();
         if (!($$0.a_($$6).b() instanceof djy)) {
            return bqi.c($$3);
         } else if ($$0.a($$1, $$6) && $$1.a($$6, $$4.b(), $$3)) {
            bsn<?> $$7 = this.i($$3);
            bsh $$8 = $$7.a((aqm)$$0, $$3, $$1, $$6, btg.m, false, false);
            if ($$8 == null) {
               return bqi.c($$3);
            } else {
               $$3.a(1, $$1);
               $$1.b(avr.c.b(this));
               $$0.a($$1, dxh.t, $$8.dp());
               return bqi.b($$3);
            }
         } else {
            return bqi.d($$3);
         }
      }
   }

   public boolean a(cud $$0, bsn<?> $$1) {
      return Objects.equals(this.i($$0), $$1);
   }

   public int a(int $$0) {
      return $$0 == 0 ? this.c : this.j;
   }

   @Nullable
   public static cvk a(@Nullable bsn<?> $$0) {
      return a.get($$0);
   }

   public static Iterable<cvk> h() {
      return Iterables.unmodifiableIterable(a.values());
   }

   public bsn<?> i(cud $$0) {
      cwr $$1 = $$0.a(kn.M, cwr.a);
      return !$$1.b() ? $$1.a(b).result().orElse(this.k) : this.k;
   }

   @Override
   public coz i() {
      return this.k.i();
   }

   public Optional<bte> a(cml $$0, bte $$1, bsn<? extends bte> $$2, aqm $$3, ewh $$4, cud $$5) {
      if (!this.a($$5, $$2)) {
         return Optional.empty();
      } else {
         bte $$6;
         if ($$1 instanceof bsb) {
            $$6 = ((bsb)$$1).a($$3, (bsb)$$1);
         } else {
            $$6 = $$2.a((dcg)$$3);
         }

         if ($$6 == null) {
            return Optional.empty();
         } else {
            $$6.a(true);
            if (!$$6.o_()) {
               return Optional.empty();
            } else {
               $$6.b($$4.a(), $$4.b(), $$4.c(), 0.0F, 0.0F);
               $$3.a_($$6);
               $$6.b($$5.a(kn.g));
               $$5.a(1, $$0);
               return Optional.of($$6);
            }
         }
      }
   }
}
