import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dmp extends djl {
   public static final MapCodec<dmp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(mb.e.q().fieldOf("potted").forGetter($$0x -> $$0x.e), t()).apply($$0, dmp::new)
   );
   private static final Map<djl, djl> d = Maps.newHashMap();
   public static final float b = 3.0F;
   protected static final fbt c = djl.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);
   private final djl e;

   @Override
   public MapCodec<dmp> a() {
      return a;
   }

   public dmp(djl $$0, dwv.d $$1) {
      super($$1);
      this.e = $$0;
      d.put($$0, this);
   }

   @Override
   protected fbt a(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      return c;
   }

   @Override
   protected bsj a(cwo $$0, dww $$1, dgh $$2, ji $$3, cow $$4, bsi $$5, fav $$6) {
      dww $$8 = ($$0.h() instanceof cuu $$7 ? d.getOrDefault($$7.d(), djn.a) : djn.a).m();
      if ($$8.l()) {
         return bsj.f;
      } else if (!this.q()) {
         return bsj.c;
      } else {
         $$2.a($$3, $$8, 3);
         $$2.a($$4, ebs.c, $$3);
         $$4.a(awk.ah);
         $$0.a(1, $$4);
         return bsj.a;
      }
   }

   @Override
   protected bsj a(dww $$0, dgh $$1, ji $$2, cow $$3, fav $$4) {
      if (this.q()) {
         return bsj.c;
      } else {
         cwo $$5 = new cwo(this.e);
         if (!$$3.i($$5)) {
            $$3.a($$5, false);
         }

         $$1.a($$2, djn.gm.m(), 3);
         $$1.a($$3, ebs.c, $$2);
         return bsj.a;
      }
   }

   @Override
   protected cwo a(dgk $$0, ji $$1, dww $$2, boolean $$3) {
      return this.q() ? super.a($$0, $$1, $$2, $$3) : new cwo(this.e);
   }

   private boolean q() {
      return this.e == djn.a;
   }

   @Override
   protected dww a(dww $$0, dgk $$1, dgw $$2, ji $$3, jn $$4, ji $$5, dww $$6, azh $$7) {
      return $$4 == jn.a && !$$0.a($$1, $$3) ? djn.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   public djl b() {
      return this.e;
   }

   @Override
   protected boolean a(dww $$0, etn $$1) {
      return false;
   }

   @Override
   protected boolean f(dww $$0) {
      return $$0.a(djn.ub) || $$0.a(djn.uc);
   }

   @Override
   protected void b(dww $$0, ard $$1, ji $$2, azh $$3) {
      if (this.f($$0) && $$1.G_().j()) {
         boolean $$4 = this.e == djn.tZ;
         boolean $$5 = dlg.a($$1);
         if ($$4 != $$5) {
            $$1.a($$2, this.o($$0), 3);
            dmf.a $$6 = dmf.a.a($$4).c();
            $$6.a($$1, $$2, $$3);
            $$1.a(null, $$2, $$6.e(), awb.e, 1.0F, 1.0F);
         }
      }

      super.b($$0, $$1, $$2, $$3);
   }

   public dww o(dww $$0) {
      if ($$0.a(djn.ub)) {
         return djn.uc.m();
      } else {
         return $$0.a(djn.uc) ? djn.ub.m() : $$0;
      }
   }
}
