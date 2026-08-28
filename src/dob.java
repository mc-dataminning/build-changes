import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dob extends dmd implements dqd {
   public static final MapCodec<dob> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("automatic").forGetter($$0x -> $$0x.e), t()).apply($$0, dob::new)
   );
   private static final Logger d = LogUtils.getLogger();
   public static final ebr<jb> b = dov.a;
   public static final ebk c = ebj.f;
   private final boolean e;

   @Override
   public MapCodec<dob> a() {
      return a;
   }

   public dob(boolean $$0, eas.d $$1) {
      super($$1);
      this.l(this.C.b().b(b, jb.c).b(c, Boolean.valueOf(false)));
      this.e = $$0;
   }

   @Override
   public dxr a(iv $$0, eat $$1) {
      dyc $$2 = new dyc($$0, $$1);
      $$2.b(this.e);
      return $$2;
   }

   @Override
   protected void a(eat $$0, djm $$1, iv $$2, dmr $$3, @Nullable eyi $$4, boolean $$5) {
      if (!$$1.C) {
         if ($$1.c_($$2) instanceof dyc $$7) {
            this.a($$1, $$2, $$7, $$1.D($$2));
         }
      }
   }

   private void a(djm $$0, iv $$1, dyc $$2, boolean $$3) {
      boolean $$4 = $$2.c();
      if ($$3 != $$4) {
         $$2.a($$3);
         if ($$3) {
            if ($$2.d() || $$2.s() == dyc.a.a) {
               return;
            }

            $$2.k();
            $$0.a($$1, this, 1);
         }
      }
   }

   @Override
   protected void a(eat $$0, arq $$1, iv $$2, azv $$3) {
      if ($$1.c_($$2) instanceof dyc $$5) {
         dil $$6 = $$5.a();
         boolean $$7 = !bal.b($$6.m());
         dyc.a $$8 = $$5.s();
         boolean $$9 = $$5.j();
         if ($$8 == dyc.a.b) {
            $$5.k();
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.t()) {
               $$6.a(0);
            }

            if ($$5.c() || $$5.d()) {
               $$1.a($$2, this, 1);
            }
         } else if ($$8 == dyc.a.c) {
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.t()) {
               $$6.a(0);
            }
         }

         $$1.b($$2, this);
      }
   }

   private void a(eat $$0, arq $$1, iv $$2, dil $$3, boolean $$4) {
      if ($$4) {
         $$3.a($$1);
      } else {
         $$3.a(0);
      }

      a($$1, $$2, $$0.c(b));
   }

   @Override
   protected bug a(eat $$0, djm $$1, iv $$2, crm $$3, fey $$4) {
      dxr $$5 = $$1.c_($$2);
      if ($$5 instanceof dyc && $$3.gF()) {
         $$3.a((dyc)$$5);
         return bug.a;
      } else {
         return bug.e;
      }
   }

   @Override
   protected boolean c_(eat $$0) {
      return true;
   }

   @Override
   protected int a(eat $$0, djm $$1, iv $$2) {
      dxr $$3 = $$1.c_($$2);
      return $$3 instanceof dyc ? ((dyc)$$3).a().k() : 0;
   }

   @Override
   public void a(djm $$0, iv $$1, eat $$2, bxj $$3, czn $$4) {
      if ($$0.c_($$1) instanceof dyc $$6) {
         dil $$8 = $$6.a();
         if ($$0 instanceof arq $$9) {
            if (!$$4.c(kk.aa)) {
               $$8.a($$9.O().c(dji.q));
               $$6.b(this.e);
            }

            boolean $$10 = $$0.D($$1);
            this.a($$0, $$1, $$6, $$10);
         }
      }
   }

   @Override
   protected eat a(eat $$0, dtl $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected eat a(eat $$0, dru $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(b, c);
   }

   @Override
   public eat a(ddg $$0) {
      return this.m().b(b, $$0.d().g());
   }

   private static void a(arq $$0, iv $$1, jb $$2) {
      iv.a $$3 = $$1.k();
      dji $$4 = $$0.O();
      int $$5 = $$4.d(dji.z);

      while ($$5-- > 0) {
         $$3.c($$2);
         eat $$6 = $$0.a_($$3);
         dmr $$7 = $$6.b();
         if (!$$6.a(dmt.ln) || !($$0.c_($$3) instanceof dyc $$9) || $$9.s() != dyc.a.a) {
            break;
         }

         if ($$9.c() || $$9.d()) {
            dil $$10 = $$9.a();
            if ($$9.k()) {
               if (!$$10.a($$0)) {
                  break;
               }

               $$0.b($$3, $$7);
            } else if ($$9.t()) {
               $$10.a(0);
            }
         }

         $$2 = $$6.c(b);
      }

      if ($$5 <= 0) {
         int $$11 = Math.max($$4.d(dji.z), 0);
         d.warn("Command Block chain tried to execute more than {} steps!", $$11);
      }
   }
}
