import com.mojang.authlib.GameProfile;
import java.util.Map;

public class fsl<T extends bfz, M extends fbf<T> & fbn> extends ftg<T, M> {
   private final float a;
   private final float b;
   private final float c;
   private final Map<cwp.a, fdc> d;
   private final fjt e;

   public fsl(fqt<T, M> $$0, fea $$1, fjt $$2) {
      this($$0, $$1, 1.0F, 1.0F, 1.0F, $$2);
   }

   public fsl(fqt<T, M> $$0, fea $$1, float $$2, float $$3, float $$4, fjt $$5) {
      super($$0);
      this.a = $$2;
      this.b = $$3;
      this.c = $$4;
      this.d = fmj.a($$1);
      this.e = $$5;
   }

   public void a(eij $$0, fjx $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cfz $$10 = $$3.c(bfo.f);
      if (!$$10.b()) {
         cfu $$11 = $$10.d();
         $$0.a();
         $$0.b(this.a, this.b, this.c);
         boolean $$12 = $$3 instanceof byb || $$3 instanceof bww;
         if ($$3.h_() && !($$3 instanceof byb)) {
            float $$13 = 2.0F;
            float $$14 = 1.4F;
            $$0.a(0.0F, 0.03125F, 0.0F);
            $$0.b(0.7F, 0.7F, 0.7F);
            $$0.a(0.0F, 1.0F, 0.0F);
         }

         this.c().d().a($$0);
         if ($$11 instanceof cds && ((cds)$$11).e() instanceof coj) {
            float $$15 = 1.1875F;
            $$0.b(1.1875F, -1.1875F, -1.1875F);
            if ($$12) {
               $$0.a(0.0F, 0.0625F, 0.0F);
            }

            GameProfile $$16 = null;
            if ($$10.u()) {
               qr $$17 = $$10.v();
               if ($$17.b("SkullOwner", 10)) {
                  $$16 = rd.a($$17.p("SkullOwner"));
               }
            }

            $$0.a(-0.5, 0.0, -0.5);
            cwp.a $$18 = ((coj)((cds)$$11).e()).a();
            fdc $$19 = this.d.get($$18);
            fkf $$20 = fmj.a($$18, $$16);
            bgz $$22;
            if ($$3.cW() instanceof bfz $$21) {
               $$22 = $$21.aR;
            } else {
               $$22 = $$3.aR;
            }

            float $$24 = $$22.c($$6);
            fmj.a(null, 180.0F, $$24, $$0, $$1, $$2, $$19, $$20);
         } else if (!($$11 instanceof cdj $$25) || $$25.g() != bfo.f) {
            a($$0, $$12);
            this.e.a($$3, $$10, cfw.f, false, $$0, $$1, $$2);
         }

         $$0.b();
      }
   }

   public static void a(eij $$0, boolean $$1) {
      float $$2 = 0.625F;
      $$0.a(0.0F, -0.25F, 0.0F);
      $$0.a(a.d.rotationDegrees(180.0F));
      $$0.b(0.625F, -0.625F, -0.625F);
      if ($$1) {
         $$0.a(0.0F, 0.1875F, 0.0F);
      }
   }
}
