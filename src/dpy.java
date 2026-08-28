import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dpy extends dmr {
   public static final MapCodec<dpy> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(mg.e.q().fieldOf("potted").forGetter($$0x -> $$0x.d), t()).apply($$0, dpy::new)
   );
   private static final Map<dmr, dmr> b = Maps.newHashMap();
   private static final ffw c = dmr.b(6.0, 0.0, 6.0);
   private final dmr d;

   @Override
   public MapCodec<dpy> a() {
      return a;
   }

   public dpy(dmr $$0, eas.d $$1) {
      super($$1);
      this.d = $$0;
      b.put($$0, this);
   }

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return c;
   }

   @Override
   protected bug a(czn $$0, eat $$1, djm $$2, iv $$3, crm $$4, buf $$5, fey $$6) {
      eat $$8 = ($$0.h() instanceof cxv $$7 ? b.getOrDefault($$7.c(), dmt.a) : dmt.a).m();
      if ($$8.l()) {
         return bug.f;
      } else if (!this.q()) {
         return bug.c;
      } else {
         $$2.a($$3, $$8, 3);
         $$2.a($$4, eft.c, $$3);
         $$4.a(awx.ah);
         $$0.a(1, $$4);
         return bug.a;
      }
   }

   @Override
   protected bug a(eat $$0, djm $$1, iv $$2, crm $$3, fey $$4) {
      if (this.q()) {
         return bug.c;
      } else {
         czn $$5 = new czn(this.d);
         if (!$$3.h($$5)) {
            $$3.a($$5, false);
         }

         $$1.a($$2, dmt.gq.m(), 3);
         $$1.a($$3, eft.c, $$2);
         return bug.a;
      }
   }

   @Override
   protected czn a(djp $$0, iv $$1, eat $$2, boolean $$3) {
      return this.q() ? super.a($$0, $$1, $$2, $$3) : new czn(this.d);
   }

   private boolean q() {
      return this.d == dmt.a;
   }

   @Override
   protected eat a(eat $$0, djp $$1, dkb $$2, iv $$3, jb $$4, iv $$5, eat $$6, azv $$7) {
      return $$4 == jb.a && !$$0.a($$1, $$3) ? dmt.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   public dmr b() {
      return this.d;
   }

   @Override
   protected boolean a(eat $$0, exp $$1) {
      return false;
   }

   @Override
   protected boolean f(eat $$0) {
      return $$0.a(dmt.uj) || $$0.a(dmt.uk);
   }

   @Override
   protected void b(eat $$0, arq $$1, iv $$2, azv $$3) {
      if (this.f($$0) && $$1.B_().j()) {
         boolean $$4 = this.d == dmt.uh;
         boolean $$5 = don.a($$1);
         if ($$4 != $$5) {
            $$1.a($$2, this.o($$0), 3);
            dpm.a $$6 = dpm.a.a($$4).c();
            $$6.a($$1, $$2, $$3);
            $$1.a(null, $$2, $$6.e(), awo.e, 1.0F, 1.0F);
         }
      }

      super.b($$0, $$1, $$2, $$3);
   }

   public eat o(eat $$0) {
      if ($$0.a(dmt.uj)) {
         return dmt.uk.m();
      } else {
         return $$0.a(dmt.uk) ? dmt.uj.m() : $$0;
      }
   }
}
