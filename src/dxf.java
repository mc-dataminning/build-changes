import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class dxf extends djq {
   public static final MapCodec<dxf> a = b(dxf::new);
   public static final dyk<jm> b = dxh.a;
   public static final dyk<dyo> c = dxh.c;

   @Override
   public MapCodec<dxf> a() {
      return a;
   }

   public dxf(dxm.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jm.c).b(c, dyo.a));
   }

   @Nullable
   @Override
   public dup a(jh $$0, dxn $$1) {
      return null;
   }

   public static dup a(jh $$0, dxn $$1, dxn $$2, jm $$3, boolean $$4, boolean $$5) {
      return new dxj($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public <T extends dup> duq<T> a(dha $$0, dxn $$1, dur<T> $$2) {
      return a($$2, dur.l, dxj::a);
   }

   @Override
   protected void a(dxn $$0, dha $$1, jh $$2, dxn $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dup $$5 = $$1.c_($$2);
         if ($$5 instanceof dxj) {
            ((dxj)$$5).k();
         }
      }
   }

   @Override
   public void a(dhb $$0, jh $$1, dxn $$2) {
      jh $$3 = $$1.a($$2.c(b).g());
      dxn $$4 = $$0.a_($$3);
      if ($$4.b() instanceof dxg && $$4.c(dxg.c)) {
         $$0.a($$3, false);
      }
   }

   @Override
   protected bte a(dxn $$0, dha $$1, jh $$2, cps $$3, fbo $$4) {
      if (!$$1.C && $$1.c_($$2) == null) {
         $$1.a($$2, false);
         return bte.c;
      } else {
         return bte.e;
      }
   }

   @Override
   protected List<cxk> a(dxn $$0, ewk.a $$1) {
      dxj $$2 = this.a($$1.a(), jh.a($$1.a(ezd.f)));
      return $$2 == null ? Collections.emptyList() : $$2.j().a($$1);
   }

   @Override
   protected fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      return fcj.a();
   }

   @Override
   protected fcm b(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      dxj $$4 = this.a($$1, $$2);
      return $$4 != null ? $$4.a($$1, $$2) : fcj.a();
   }

   @Nullable
   private dxj a(dgf $$0, jh $$1) {
      dup $$2 = $$0.c_($$1);
      return $$2 instanceof dxj ? (dxj)$$2 : null;
   }

   @Override
   public cxk a(dhd $$0, jh $$1, dxn $$2) {
      return cxk.k;
   }

   @Override
   protected dxn a(dxn $$0, dqu $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dxn a(dxn $$0, dpd $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected boolean a(dxn $$0, eue $$1) {
      return false;
   }
}
