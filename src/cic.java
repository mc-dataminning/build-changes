import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class cic extends cke {
   public static final String a = "BlockEntityTag";
   public static final String b = "BlockStateTag";
   @Deprecated
   private final cua c;

   public cic(cua $$0, cke.a $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public bib a(cmt $$0) {
      bib $$1 = this.a(new cmr($$0));
      if (!$$1.a() && this.u()) {
         bib $$2 = this.a($$0.q(), $$0.o(), $$0.p()).a();
         return $$2 == bib.b ? bib.c : $$2;
      } else {
         return $$1;
      }
   }

   public bib a(cmr $$0) {
      if (!this.e().a($$0.q().G())) {
         return bib.e;
      } else if (!$$0.b()) {
         return bib.e;
      } else {
         cmr $$1 = this.b($$0);
         if ($$1 == null) {
            return bib.e;
         } else {
            dgb $$2 = this.c($$1);
            if ($$2 == null) {
               return bib.e;
            } else if (!this.a($$1, $$2)) {
               return bib.e;
            } else {
               ht $$3 = $$1.a();
               cqz $$4 = $$1.q();
               ccx $$5 = $$1.o();
               ckj $$6 = $$1.n();
               dgb $$7 = $$4.a_($$3);
               if ($$7.a($$2.b())) {
                  $$7 = this.a($$3, $$4, $$6, $$7);
                  this.a($$3, $$4, $$5, $$6, $$7);
                  $$7.b().a($$4, $$3, $$7, $$5, $$6);
                  if ($$5 instanceof alr) {
                     al.y.a((alr)$$5, $$3, $$6);
                  }
               }

               dbl $$8 = $$7.w();
               $$4.a($$5, $$3, this.a($$7), aqe.e, ($$8.a() + 1.0F) / 2.0F, $$8.b() * 0.8F);
               $$4.a(dkl.i, $$3, dkl.a.a($$5, $$7));
               if ($$5 == null || !$$5.fT().d) {
                  $$6.h(1);
               }

               return bib.a($$4.B);
            }
         }
      }
   }

   protected aqc a(dgb $$0) {
      return $$0.w().e();
   }

   @Nullable
   public cmr b(cmr $$0) {
      return $$0;
   }

   protected boolean a(ht $$0, cqz $$1, @Nullable ccx $$2, ckj $$3, dgb $$4) {
      return a($$1, $$2, $$0, $$3);
   }

   @Nullable
   protected dgb c(cmr $$0) {
      dgb $$1 = this.e().a($$0);
      return $$1 != null && this.b($$0, $$1) ? $$1 : null;
   }

   private dgb a(ht $$0, cqz $$1, ckj $$2, dgb $$3) {
      dgb $$4 = $$3;
      rt $$5 = $$2.v();
      if ($$5 != null) {
         rt $$6 = $$5.p("BlockStateTag");
         dgc<cua, dgb> $$7 = $$3.b().n();

         for (String $$8 : $$6.e()) {
            dhe<?> $$9 = $$7.a($$8);
            if ($$9 != null) {
               String $$10 = $$6.c($$8).s_();
               $$4 = a($$4, $$9, $$10);
            }
         }
      }

      if ($$4 != $$3) {
         $$1.a($$0, $$4, 2);
      }

      return $$4;
   }

   private static <T extends Comparable<T>> dgb a(dgb $$0, dhe<T> $$1, String $$2) {
      return $$1.b($$2).map($$2x -> $$0.a($$1, $$2x)).orElse($$0);
   }

   protected boolean b(cmr $$0, dgb $$1) {
      ccx $$2 = $$0.o();
      eik $$3 = $$2 == null ? eik.a() : eik.a($$2);
      return (!this.d() || $$1.a((crc)$$0.q(), $$0.a())) && $$0.q().a($$1, $$0.a(), $$3);
   }

   protected boolean d() {
      return true;
   }

   protected boolean a(cmr $$0, dgb $$1) {
      return $$0.q().a($$0.a(), $$1, 11);
   }

   public static boolean a(cqz $$0, @Nullable ccx $$1, ht $$2, ckj $$3) {
      MinecraftServer $$4 = $$0.n();
      if ($$4 == null) {
         return false;
      } else {
         rt $$5 = a($$3);
         if ($$5 != null) {
            ddx $$6 = $$0.c_($$2);
            if ($$6 != null) {
               if (!$$0.B && $$6.t() && ($$1 == null || !$$1.gp())) {
                  return false;
               }

               rt $$7 = $$6.o();
               rt $$8 = $$7.h();
               $$7.a($$5);
               if (!$$7.equals($$8)) {
                  $$6.a($$7);
                  $$6.e();
                  return true;
               }
            }
         }

         return false;
      }
   }

   @Override
   public String a() {
      return this.e().h();
   }

   @Override
   public void a(ckj $$0, @Nullable cqz $$1, List<ui> $$2, cma $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.e().a($$0, $$1, $$2, $$3);
   }

   public cua e() {
      return this.c;
   }

   public void a(Map<cua, cke> $$0, cke $$1) {
      $$0.put(this.e(), $$1);
   }

   @Override
   public boolean ao_() {
      return !(this.c instanceof dax);
   }

   @Override
   public void a(bzq $$0) {
      if (this.c instanceof dax) {
         ckj $$1 = $$0.q();
         rt $$2 = a($$1);
         if ($$2 != null && $$2.b("Items", 9)) {
            rz $$3 = $$2.c("Items", 10);
            ckl.a($$0, $$3.stream().map(rt.class::cast).map(ckj::a));
         }
      }
   }

   @Nullable
   public static rt a(ckj $$0) {
      return $$0.b("BlockEntityTag");
   }

   public static void a(ckj $$0, ddz<?> $$1, rt $$2) {
      if ($$2.g()) {
         $$0.c("BlockEntityTag");
      } else {
         ddx.a($$2, $$1);
         $$0.a("BlockEntityTag", $$2);
      }
   }

   @Override
   public cfg m() {
      return this.e().m();
   }
}
