import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dky extends diz {
   public static final MapCodec<dky> a = b(dky::new);
   public static final dws<dwq> b = dwl.ae;

   @Override
   public MapCodec<? extends dky> a() {
      return a;
   }

   public dky(dvu.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, dwq.b));
   }

   @Override
   protected dvv a(dvv $$0, dfp $$1, dgb $$2, jh $$3, jm $$4, jh $$5, dvv $$6, azu $$7) {
      dwq $$8 = $$0.c(b);
      if ($$4.o() != jm.a.b || $$8 == dwq.b != ($$4 == jm.b) || $$6.a(this) && $$6.c(b) != $$8) {
         return $$8 == dwq.b && $$4 == jm.a && !$$0.a($$1, $$3) ? dis.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         return dis.a.m();
      }
   }

   @Nullable
   @Override
   public dvv a(dad $$0) {
      jh $$1 = $$0.a();
      dfm $$2 = $$0.q();
      return $$1.v() < $$2.al() && $$2.a_($$1.d()).a($$0) ? super.a($$0) : null;
   }

   @Override
   public void a(dfm $$0, jh $$1, dvv $$2, bvh $$3, cwm $$4) {
      jh $$5 = $$1.d();
      $$0.a($$5, c($$0, $$5, this.m().b(b, dwq.a)), 3);
   }

   @Override
   protected boolean a(dvv $$0, dfp $$1, jh $$2) {
      if ($$0.c(b) != dwq.a) {
         return super.a($$0, $$1, $$2);
      } else {
         dvv $$3 = $$1.a_($$2.e());
         return $$3.a(this) && $$3.c(b) == dwq.b;
      }
   }

   public static void a(dfn $$0, dvv $$1, jh $$2, int $$3) {
      jh $$4 = $$2.d();
      $$0.a($$2, c($$0, $$2, $$1.b(b, dwq.b)), $$3);
      $$0.a($$4, c($$0, $$4, $$1.b(b, dwq.a)), $$3);
   }

   public static dvv c(dfp $$0, jh $$1, dvv $$2) {
      return $$2.b(dwl.C) ? $$2.b(dwl.C, Boolean.valueOf($$0.z($$1))) : $$2;
   }

   @Override
   public dvv a(dfm $$0, jh $$1, dvv $$2, cou $$3) {
      if (!$$0.C) {
         if ($$3.b()) {
            b($$0, $$1, $$2, $$3);
         } else {
            a($$2, $$0, $$1, null, $$3, $$3.eX());
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dfm $$0, cou $$1, jh $$2, dvv $$3, @Nullable dsy $$4, cwm $$5) {
      super.a($$0, $$1, $$2, dis.a.m(), $$4, $$5);
   }

   protected static void b(dfm $$0, jh $$1, dvv $$2, cou $$3) {
      dwq $$4 = $$2.c(b);
      if ($$4 == dwq.a) {
         jh $$5 = $$1.e();
         dvv $$6 = $$0.a_($$5);
         if ($$6.a($$2.b()) && $$6.c(b) == dwq.b) {
            dvv $$7 = $$6.y().b(erw.c) ? dis.G.m() : dis.a.m();
            $$0.a($$5, $$7, 35);
            $$0.a($$3, 2001, $$5, diq.j($$6));
         }
      }
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(b);
   }

   @Override
   protected long a(dvv $$0, jh $$1) {
      return azm.b($$1.u(), $$1.c($$0.c(b) == dwq.b ? 0 : 1).v(), $$1.w());
   }
}
