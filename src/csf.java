import java.util.List;

public class csf extends ctx {
   public csf(ctx.a $$0) {
      super($$0);
   }

   @Override
   public bqh<cuc> a(dcf $$0, cmk $$1, bqf $$2) {
      List<bsc> $$3 = $$0.a(bsc.class, $$1.cL().g(2.0), $$0x -> $$0x != null && $$0x.bE() && $$0x.q() instanceof chn);
      cuc $$4 = $$1.b($$2);
      if (!$$3.isEmpty()) {
         bsc $$5 = $$3.get(0);
         $$5.a($$5.g() - 0.5F);
         $$0.a(null, $$1.dv(), $$1.dx(), $$1.dB(), avh.cD, avi.g, 1.0F, 1.0F);
         $$0.a($$1, dxg.y, $$1.do());
         if ($$1 instanceof aqn $$6) {
            am.T.a($$6, $$4, $$5);
         }

         return bqh.a(this.a($$4, $$1, new cuc(cuf.vn)), $$0.x_());
      } else {
         ewb $$7 = a($$0, $$1, dbo.b.b);
         if ($$7.c() == ewd.a.a) {
            return bqh.c($$4);
         } else {
            if ($$7.c() == ewd.a.b) {
               ja $$8 = $$7.a();
               if (!$$0.a($$1, $$8)) {
                  return bqh.c($$4);
               }

               if ($$0.b_($$8).a(awc.a)) {
                  $$0.a($$1, $$1.dv(), $$1.dx(), $$1.dB(), avh.cC, avi.g, 1.0F, 1.0F);
                  $$0.a($$1, dxg.y, $$8);
                  return bqh.a(this.a($$4, $$1, cwd.a(cuf.sk, cwe.a)), $$0.x_());
               }
            }

            return bqh.c($$4);
         }
      }
   }

   protected cuc a(cuc $$0, cmk $$1, cuc $$2) {
      $$1.b(avr.c.b(this));
      return cue.a($$0, $$1, $$2);
   }
}
