import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class die extends dgh implements dkd {
   public static final MapCodec<die> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("automatic").forGetter($$0x -> $$0x.e), u()).apply($$0, die::new)
   );
   private static final Logger d = LogUtils.getLogger();
   public static final duu b = diy.a;
   public static final dur c = duq.c;
   private final boolean e;

   @Override
   public MapCodec<die> a() {
      return a;
   }

   public die(boolean $$0, dtz.d $$1) {
      super($$1);
      this.l(this.E.b().b(b, jj.c).b(c, Boolean.valueOf(false)));
      this.e = $$0;
   }

   @Override
   public dre a(je $$0, dua $$1) {
      dro $$2 = new dro($$0, $$1);
      $$2.b(this.e);
      return $$2;
   }

   @Override
   protected void a(dua $$0, dds $$1, je $$2, dgv $$3, @Nullable erj $$4, boolean $$5) {
      if (!$$1.B) {
         if ($$1.c_($$2) instanceof dro $$7) {
            this.a($$1, $$2, $$7, $$1.C($$2));
         }
      }
   }

   private void a(dds $$0, je $$1, dro $$2, boolean $$3) {
      boolean $$4 = $$2.c();
      if ($$3 != $$4) {
         $$2.a($$3);
         if ($$3) {
            if ($$2.d() || $$2.t() == dro.a.a) {
               return;
            }

            $$2.k();
            $$0.a($$1, this, 1);
         }
      }
   }

   @Override
   protected void a(dua $$0, arg $$1, je $$2, azk $$3) {
      if ($$1.c_($$2) instanceof dro $$5) {
         dcs $$6 = $$5.b();
         boolean $$7 = !azz.b($$6.m());
         dro.a $$8 = $$5.t();
         boolean $$9 = $$5.j();
         if ($$8 == dro.a.b) {
            $$5.k();
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.u()) {
               $$6.a(0);
            }

            if ($$5.c() || $$5.d()) {
               $$1.a($$2, this, 1);
            }
         } else if ($$8 == dro.a.c) {
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.u()) {
               $$6.a(0);
            }
         }

         $$1.c($$2, this);
      }
   }

   private void a(dua $$0, dds $$1, je $$2, dcs $$3, boolean $$4) {
      if ($$4) {
         $$3.a($$1);
      } else {
         $$3.a(0);
      }

      a($$1, $$2, $$0.c(b));
   }

   @Override
   protected brk a(dua $$0, dds $$1, je $$2, cnp $$3, eya $$4) {
      dre $$5 = $$1.c_($$2);
      if ($$5 instanceof dro && $$3.gz()) {
         $$3.a((dro)$$5);
         return brk.a;
      } else {
         return brk.e;
      }
   }

   @Override
   protected boolean c_(dua $$0) {
      return true;
   }

   @Override
   protected int a(dua $$0, dds $$1, je $$2) {
      dre $$3 = $$1.c_($$2);
      return $$3 instanceof dro ? ((dro)$$3).b().k() : 0;
   }

   @Override
   public void a(dds $$0, je $$1, dua $$2, buf $$3, cvl $$4) {
      if ($$0.c_($$1) instanceof dro $$6) {
         dcs $$8 = $$6.b();
         if (!$$0.B) {
            if (!$$4.b(kr.Q)) {
               $$8.a($$0.ac().b(ddo.p));
               $$6.b(this.e);
            }

            boolean $$9 = $$0.C($$1);
            this.a($$0, $$1, $$6, $$9);
         }
      }
   }

   @Override
   protected dnc a_(dua $$0) {
      return dnc.c;
   }

   @Override
   protected dua a(dua $$0, dnj $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dua a(dua $$0, dls $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(b, c);
   }

   @Override
   public dua a(cyw $$0) {
      return this.o().b(b, $$0.d().g());
   }

   private static void a(dds $$0, je $$1, jj $$2) {
      je.a $$3 = $$1.k();
      ddo $$4 = $$0.ac();
      int $$5 = $$4.c(ddo.x);

      while ($$5-- > 0) {
         $$3.c($$2);
         dua $$6 = $$0.a_($$3);
         dgv $$7 = $$6.b();
         if (!$$6.a(dgx.kH) || !($$0.c_($$3) instanceof dro $$9) || $$9.t() != dro.a.a) {
            break;
         }

         if ($$9.c() || $$9.d()) {
            dcs $$10 = $$9.b();
            if ($$9.k()) {
               if (!$$10.a($$0)) {
                  break;
               }

               $$0.c($$3, $$7);
            } else if ($$9.u()) {
               $$10.a(0);
            }
         }

         $$2 = $$6.c(b);
      }

      if ($$5 <= 0) {
         int $$11 = Math.max($$4.c(ddo.x), 0);
         d.warn("Command Block chain tried to execute more than {} steps!", $$11);
      }
   }
}
