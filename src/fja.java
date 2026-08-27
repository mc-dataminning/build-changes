import com.google.common.collect.ImmutableList;
import java.util.Map;
import org.joml.Vector3f;

public class fja<T extends bzf & bmj> extends fiu<T> {
   public static final float a = 1.8849558F;
   private final fmx b;
   private final fmx f;
   private final fmx g;
   private final fmx h;
   private final fmx i;
   private final fmx j;
   private final fmx k;
   private final fmx l;
   private final fmx m;
   private final fmx n;

   public fja(fmx $$0) {
      super(true, 8.0F, 3.35F);
      this.j = $$0.b("body");
      this.k = this.j.b("head");
      this.g = this.j.b("right_hind_leg");
      this.f = this.j.b("left_hind_leg");
      this.i = this.j.b("right_front_leg");
      this.h = this.j.b("left_front_leg");
      this.b = this.j.b("tail");
      this.l = this.k.b("top_gills");
      this.m = this.k.b("left_gills");
      this.n = this.k.b("right_gills");
   }

   public static fnd c() {
      fnf $$0 = new fnf();
      fng $$1 = $$0.a();
      fng $$2 = $$1.a(
         "body", fnc.c().a(0, 11).a(-4.0F, -2.0F, -9.0F, 8.0F, 4.0F, 10.0F).a(2, 17).a(0.0F, -3.0F, -8.0F, 0.0F, 5.0F, 9.0F), fmz.a(0.0F, 20.0F, 5.0F)
      );
      fnb $$3 = new fnb(0.001F);
      fng $$4 = $$2.a("head", fnc.c().a(0, 1).a(-4.0F, -3.0F, -5.0F, 8.0F, 5.0F, 5.0F, $$3), fmz.a(0.0F, 0.0F, -9.0F));
      fnc $$5 = fnc.c().a(3, 37).a(-4.0F, -3.0F, 0.0F, 8.0F, 3.0F, 0.0F, $$3);
      fnc $$6 = fnc.c().a(0, 40).a(-3.0F, -5.0F, 0.0F, 3.0F, 7.0F, 0.0F, $$3);
      fnc $$7 = fnc.c().a(11, 40).a(0.0F, -5.0F, 0.0F, 3.0F, 7.0F, 0.0F, $$3);
      $$4.a("top_gills", $$5, fmz.a(0.0F, -3.0F, -1.0F));
      $$4.a("left_gills", $$6, fmz.a(-4.0F, 0.0F, -1.0F));
      $$4.a("right_gills", $$7, fmz.a(4.0F, 0.0F, -1.0F));
      fnc $$8 = fnc.c().a(2, 13).a(-1.0F, 0.0F, 0.0F, 3.0F, 5.0F, 0.0F, $$3);
      fnc $$9 = fnc.c().a(2, 13).a(-2.0F, 0.0F, 0.0F, 3.0F, 5.0F, 0.0F, $$3);
      $$2.a("right_hind_leg", $$9, fmz.a(-3.5F, 1.0F, -1.0F));
      $$2.a("left_hind_leg", $$8, fmz.a(3.5F, 1.0F, -1.0F));
      $$2.a("right_front_leg", $$9, fmz.a(-3.5F, 1.0F, -8.0F));
      $$2.a("left_front_leg", $$8, fmz.a(3.5F, 1.0F, -8.0F));
      $$2.a("tail", fnc.c().a(2, 19).a(0.0F, -3.0F, 0.0F, 0.0F, 5.0F, 12.0F), fmz.a(0.0F, 0.0F, 1.0F));
      return fnd.a($$0, 64, 64);
   }

   @Override
   protected Iterable<fmx> a() {
      return ImmutableList.of();
   }

   @Override
   protected Iterable<fmx> b() {
      return ImmutableList.of(this.j);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a($$0, $$4, $$5);
      if ($$0.gk()) {
         this.b($$4);
         this.a($$0);
      } else {
         boolean $$6 = $$2 > 1.0E-5F || $$0.dE() != $$0.O || $$0.dC() != $$0.N;
         if ($$0.bc()) {
            if ($$6) {
               this.d($$3, $$5);
            } else {
               this.a($$3);
            }

            this.a($$0);
         } else {
            if ($$0.aC()) {
               if ($$6) {
                  this.c($$3, $$4);
               } else {
                  this.b($$3, $$4);
               }
            }

            this.a($$0);
         }
      }
   }

   private void a(T $$0) {
      Map<String, Vector3f> $$1 = $$0.a();
      $$1.put("body", this.a(this.j));
      $$1.put("head", this.a(this.k));
      $$1.put("right_hind_leg", this.a(this.g));
      $$1.put("left_hind_leg", this.a(this.f));
      $$1.put("right_front_leg", this.a(this.i));
      $$1.put("left_front_leg", this.a(this.h));
      $$1.put("tail", this.a(this.b));
      $$1.put("top_gills", this.a(this.l));
      $$1.put("left_gills", this.a(this.m));
      $$1.put("right_gills", this.a(this.n));
   }

   private Vector3f a(fmx $$0) {
      return new Vector3f($$0.e, $$0.f, $$0.g);
   }

   private void a(fmx $$0, Vector3f $$1) {
      $$0.b($$1.x(), $$1.y(), $$1.z());
   }

   private void a(T $$0, float $$1, float $$2) {
      this.j.b = 0.0F;
      this.k.c = 0.0F;
      this.j.c = 20.0F;
      Map<String, Vector3f> $$3 = $$0.a();
      if ($$3.isEmpty()) {
         this.j.b($$2 * (float) (Math.PI / 180.0), $$1 * (float) (Math.PI / 180.0), 0.0F);
         this.k.b(0.0F, 0.0F, 0.0F);
         this.f.b(0.0F, 0.0F, 0.0F);
         this.g.b(0.0F, 0.0F, 0.0F);
         this.h.b(0.0F, 0.0F, 0.0F);
         this.i.b(0.0F, 0.0F, 0.0F);
         this.m.b(0.0F, 0.0F, 0.0F);
         this.n.b(0.0F, 0.0F, 0.0F);
         this.l.b(0.0F, 0.0F, 0.0F);
         this.b.b(0.0F, 0.0F, 0.0F);
      } else {
         this.a(this.j, $$3.get("body"));
         this.a(this.k, $$3.get("head"));
         this.a(this.f, $$3.get("left_hind_leg"));
         this.a(this.g, $$3.get("right_hind_leg"));
         this.a(this.h, $$3.get("left_front_leg"));
         this.a(this.i, $$3.get("right_front_leg"));
         this.a(this.m, $$3.get("left_gills"));
         this.a(this.n, $$3.get("right_gills"));
         this.a(this.l, $$3.get("top_gills"));
         this.a(this.b, $$3.get("tail"));
      }
   }

   private float a(float $$0, float $$1) {
      return this.a(0.05F, $$0, $$1);
   }

   private float a(float $$0, float $$1, float $$2) {
      return auo.j($$0, $$1, $$2);
   }

   private void a(fmx $$0, float $$1, float $$2, float $$3) {
      $$0.b(this.a($$0.e, $$1), this.a($$0.f, $$2), this.a($$0.g, $$3));
   }

   private void b(float $$0, float $$1) {
      float $$2 = $$0 * 0.09F;
      float $$3 = auo.a($$2);
      float $$4 = auo.b($$2);
      float $$5 = $$3 * $$3 - 2.0F * $$3;
      float $$6 = $$4 * $$4 - 3.0F * $$3;
      this.k.e = this.a(this.k.e, -0.09F * $$5);
      this.k.f = this.a(this.k.f, 0.0F);
      this.k.g = this.a(this.k.g, -0.2F);
      this.b.f = this.a(this.b.f, -0.1F + 0.1F * $$5);
      this.l.e = this.a(this.l.e, 0.6F + 0.05F * $$6);
      this.m.f = this.a(this.m.f, -this.l.e);
      this.n.f = this.a(this.n.f, -this.m.f);
      this.a(this.f, 1.1F, 1.0F, 0.0F);
      this.a(this.h, 0.8F, 2.3F, -0.5F);
      this.d();
      this.j.e = this.a(0.2F, this.j.e, 0.0F);
      this.j.f = this.a(this.j.f, $$1 * (float) (Math.PI / 180.0));
      this.j.g = this.a(this.j.g, 0.0F);
   }

   private void c(float $$0, float $$1) {
      float $$2 = $$0 * 0.11F;
      float $$3 = auo.b($$2);
      float $$4 = ($$3 * $$3 - 2.0F * $$3) / 5.0F;
      float $$5 = 0.7F * $$3;
      this.k.e = this.a(this.k.e, 0.0F);
      this.k.f = this.a(this.k.f, 0.09F * $$3);
      this.k.g = this.a(this.k.g, 0.0F);
      this.b.f = this.a(this.b.f, this.k.f);
      this.l.e = this.a(this.l.e, 0.6F - 0.08F * ($$3 * $$3 + 2.0F * auo.a($$2)));
      this.m.f = this.a(this.m.f, -this.l.e);
      this.n.f = this.a(this.n.f, -this.m.f);
      this.a(this.f, 0.9424779F, 1.5F - $$4, -0.1F);
      this.a(this.h, 1.0995574F, (float) (Math.PI / 2) - $$5, 0.0F);
      this.a(this.g, this.f.e, -1.0F - $$4, 0.0F);
      this.a(this.i, this.h.e, (float) (-Math.PI / 2) - $$5, 0.0F);
      this.j.e = this.a(0.2F, this.j.e, 0.0F);
      this.j.f = this.a(this.j.f, $$1 * (float) (Math.PI / 180.0));
      this.j.g = this.a(this.j.g, 0.0F);
   }

   private void a(float $$0) {
      float $$1 = $$0 * 0.075F;
      float $$2 = auo.b($$1);
      float $$3 = auo.a($$1) * 0.15F;
      this.j.e = this.a(this.j.e, -0.15F + 0.075F * $$2);
      this.j.c -= $$3;
      this.k.e = this.a(this.k.e, -this.j.e);
      this.l.e = this.a(this.l.e, 0.2F * $$2);
      this.m.f = this.a(this.m.f, -0.3F * $$2 - 0.19F);
      this.n.f = this.a(this.n.f, -this.m.f);
      this.a(this.f, (float) (Math.PI * 3.0 / 4.0) - $$2 * 0.11F, 0.47123894F, 1.7278761F);
      this.a(this.h, (float) (Math.PI / 4) - $$2 * 0.2F, 2.042035F, 0.0F);
      this.d();
      this.b.f = this.a(this.b.f, 0.5F * $$2);
      this.k.f = this.a(this.k.f, 0.0F);
      this.k.g = this.a(this.k.g, 0.0F);
   }

   private void d(float $$0, float $$1) {
      float $$2 = $$0 * 0.33F;
      float $$3 = auo.a($$2);
      float $$4 = auo.b($$2);
      float $$5 = 0.13F * $$3;
      this.j.e = this.a(0.1F, this.j.e, $$1 * (float) (Math.PI / 180.0) + $$5);
      this.k.e = -$$5 * 1.8F;
      this.j.c -= 0.45F * $$4;
      this.l.e = this.a(this.l.e, -0.5F * $$3 - 0.8F);
      this.m.f = this.a(this.m.f, 0.3F * $$3 + 0.9F);
      this.n.f = this.a(this.n.f, -this.m.f);
      this.b.f = this.a(this.b.f, 0.3F * auo.b($$2 * 0.9F));
      this.a(this.f, 1.8849558F, -0.4F * $$3, (float) (Math.PI / 2));
      this.a(this.h, 1.8849558F, -0.2F * $$4 - 0.1F, (float) (Math.PI / 2));
      this.d();
      this.k.f = this.a(this.k.f, 0.0F);
      this.k.g = this.a(this.k.g, 0.0F);
   }

   private void b(float $$0) {
      this.a(this.f, 1.4137167F, 1.0995574F, (float) (Math.PI / 4));
      this.a(this.h, (float) (Math.PI / 4), 2.042035F, 0.0F);
      this.j.e = this.a(this.j.e, -0.15F);
      this.j.g = this.a(this.j.g, 0.35F);
      this.d();
      this.j.f = this.a(this.j.f, $$0 * (float) (Math.PI / 180.0));
      this.k.e = this.a(this.k.e, 0.0F);
      this.k.f = this.a(this.k.f, 0.0F);
      this.k.g = this.a(this.k.g, 0.0F);
      this.b.f = this.a(this.b.f, 0.0F);
      this.a(this.l, 0.0F, 0.0F, 0.0F);
      this.a(this.m, 0.0F, 0.0F, 0.0F);
      this.a(this.n, 0.0F, 0.0F, 0.0F);
   }

   private void d() {
      this.a(this.g, this.f.e, -this.f.f, -this.f.g);
      this.a(this.i, this.h.e, -this.h.f, -this.h.g);
   }
}
