import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class cgr extends cit {
   public static final String a = "BlockEntityTag";
   public static final String b = "BlockStateTag";
   @Deprecated
   private final csm c;

   public cgr(csm $$0, cit.a $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public bgq a(cli $$0) {
      bgq $$1 = this.a(new clg($$0));
      if (!$$1.a() && this.u()) {
         bgq $$2 = this.a($$0.q(), $$0.o(), $$0.p()).a();
         return $$2 == bgq.b ? bgq.c : $$2;
      } else {
         return $$1;
      }
   }

   public bgq a(clg $$0) {
      if (!this.e().a($$0.q().G())) {
         return bgq.e;
      } else if (!$$0.b()) {
         return bgq.e;
      } else {
         clg $$1 = this.b($$0);
         if ($$1 == null) {
            return bgq.e;
         } else {
            dfa $$2 = this.c($$1);
            if ($$2 == null) {
               return bgq.e;
            } else if (!this.a($$1, $$2)) {
               return bgq.e;
            } else {
               gu $$3 = $$1.a();
               cpm $$4 = $$1.q();
               cbn $$5 = $$1.o();
               ciy $$6 = $$1.n();
               dfa $$7 = $$4.a_($$3);
               if ($$7.a($$2.b())) {
                  $$7 = this.a($$3, $$4, $$6, $$7);
                  this.a($$3, $$4, $$5, $$6, $$7);
                  $$7.b().a($$4, $$3, $$7, $$5, $$6);
                  if ($$5 instanceof akl) {
                     ai.y.a((akl)$$5, $$3, $$6);
                  }
               }

               czz $$8 = $$7.w();
               $$4.a($$5, $$3, this.a($$7), aox.e, ($$8.a() + 1.0F) / 2.0F, $$8.b() * 0.8F);
               $$4.a(djk.i, $$3, djk.a.a($$5, $$7));
               if ($$5 == null || !$$5.fR().d) {
                  $$6.h(1);
               }

               return bgq.a($$4.B);
            }
         }
      }
   }

   protected aov a(dfa $$0) {
      return $$0.w().e();
   }

   @Nullable
   public clg b(clg $$0) {
      return $$0;
   }

   protected boolean a(gu $$0, cpm $$1, @Nullable cbn $$2, ciy $$3, dfa $$4) {
      return a($$1, $$2, $$0, $$3);
   }

   @Nullable
   protected dfa c(clg $$0) {
      dfa $$1 = this.e().a($$0);
      return $$1 != null && this.b($$0, $$1) ? $$1 : null;
   }

   private dfa a(gu $$0, cpm $$1, ciy $$2, dfa $$3) {
      dfa $$4 = $$3;
      qr $$5 = $$2.v();
      if ($$5 != null) {
         qr $$6 = $$5.p("BlockStateTag");
         dfb<csm, dfa> $$7 = $$3.b().l();

         for (String $$8 : $$6.e()) {
            dgd<?> $$9 = $$7.a($$8);
            if ($$9 != null) {
               String $$10 = $$6.c($$8).m_();
               $$4 = a($$4, $$9, $$10);
            }
         }
      }

      if ($$4 != $$3) {
         $$1.a($$0, $$4, 2);
      }

      return $$4;
   }

   private static <T extends Comparable<T>> dfa a(dfa $$0, dgd<T> $$1, String $$2) {
      return $$1.b($$2).map($$2x -> $$0.a($$1, $$2x)).orElse($$0);
   }

   protected boolean b(clg $$0, dfa $$1) {
      cbn $$2 = $$0.o();
      ehj $$3 = $$2 == null ? ehj.a() : ehj.a($$2);
      return (!this.d() || $$1.a((cpp)$$0.q(), $$0.a())) && $$0.q().a($$1, $$0.a(), $$3);
   }

   protected boolean d() {
      return true;
   }

   protected boolean a(clg $$0, dfa $$1) {
      return $$0.q().a($$0.a(), $$1, 11);
   }

   public static boolean a(cpm $$0, @Nullable cbn $$1, gu $$2, ciy $$3) {
      MinecraftServer $$4 = $$0.n();
      if ($$4 == null) {
         return false;
      } else {
         qr $$5 = a($$3);
         if ($$5 != null) {
            dcm $$6 = $$0.c_($$2);
            if ($$6 != null) {
               if (!$$0.B && $$6.t() && ($$1 == null || !$$1.gn())) {
                  return false;
               }

               qr $$7 = $$6.o();
               qr $$8 = $$7.h();
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
      return this.e().f();
   }

   @Override
   public void a(ciy $$0, @Nullable cpm $$1, List<tf> $$2, ckp $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.e().a($$0, $$1, $$2, $$3);
   }

   public csm e() {
      return this.c;
   }

   public void a(Map<csm, cit> $$0, cit $$1) {
      $$0.put(this.e(), $$1);
   }

   @Override
   public boolean ah_() {
      return !(this.c instanceof czl);
   }

   @Override
   public void a(byg $$0) {
      if (this.c instanceof czl) {
         ciy $$1 = $$0.j();
         qr $$2 = a($$1);
         if ($$2 != null && $$2.b("Items", 9)) {
            qx $$3 = $$2.c("Items", 10);
            cja.a($$0, $$3.stream().map(qr.class::cast).map(ciy::a));
         }
      }
   }

   @Nullable
   public static qr a(ciy $$0) {
      return $$0.b("BlockEntityTag");
   }

   public static void a(ciy $$0, dco<?> $$1, qr $$2) {
      if ($$2.g()) {
         $$0.c("BlockEntityTag");
      } else {
         dcm.a($$2, $$1);
         $$0.a("BlockEntityTag", $$2);
      }
   }

   @Override
   public cdv m() {
      return this.e().m();
   }
}
