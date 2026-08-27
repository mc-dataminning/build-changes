import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class cms extends cou {
   public static final String a = "BlockEntityTag";
   public static final String b = "BlockStateTag";
   @Deprecated
   private final cyo c;

   public cms(cyo $$0, cou.a $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public blu a(cri $$0) {
      blu $$1 = this.a(new crg($$0));
      if (!$$1.a() && this.t()) {
         blu $$2 = this.a($$0.q(), $$0.o(), $$0.p()).a();
         return $$2 == blu.b ? blu.c : $$2;
      } else {
         return $$1;
      }
   }

   public blu a(crg $$0) {
      if (!this.e().a($$0.q().I())) {
         return blu.e;
      } else if (!$$0.b()) {
         return blu.e;
      } else {
         crg $$1 = this.b($$0);
         if ($$1 == null) {
            return blu.e;
         } else {
            dlf $$2 = this.c($$1);
            if ($$2 == null) {
               return blu.e;
            } else if (!this.a($$1, $$2)) {
               return blu.e;
            } else {
               hz $$3 = $$1.a();
               cvn $$4 = $$1.q();
               chh $$5 = $$1.o();
               coz $$6 = $$1.n();
               dlf $$7 = $$4.a_($$3);
               if ($$7.a($$2.b())) {
                  $$7 = this.a($$3, $$4, $$6, $$7);
                  this.a($$3, $$4, $$5, $$6, $$7);
                  $$7.b().a($$4, $$3, $$7, $$5, $$6);
                  if ($$5 instanceof aow) {
                     am.z.a((aow)$$5, $$3, $$6);
                  }
               }

               dga $$8 = $$7.w();
               $$4.a($$5, $$3, this.a($$7), atl.e, ($$8.a() + 1.0F) / 2.0F, $$8.b() * 0.8F);
               $$4.a(dpp.i, $$3, dpp.a.a($$5, $$7));
               if ($$5 == null || !$$5.fU().d) {
                  $$6.h(1);
               }

               return blu.a($$4.B);
            }
         }
      }
   }

   protected atj a(dlf $$0) {
      return $$0.w().e();
   }

   @Nullable
   public crg b(crg $$0) {
      return $$0;
   }

   protected boolean a(hz $$0, cvn $$1, @Nullable chh $$2, coz $$3, dlf $$4) {
      return a($$1, $$2, $$0, $$3);
   }

   @Nullable
   protected dlf c(crg $$0) {
      dlf $$1 = this.e().a($$0);
      return $$1 != null && this.b($$0, $$1) ? $$1 : null;
   }

   private dlf a(hz $$0, cvn $$1, coz $$2, dlf $$3) {
      dlf $$4 = $$3;
      sw $$5 = $$2.w();
      if ($$5 != null) {
         sw $$6 = $$5.p("BlockStateTag");
         dlg<cyo, dlf> $$7 = $$3.b().n();

         for (String $$8 : $$6.e()) {
            dmi<?> $$9 = $$7.a($$8);
            if ($$9 != null) {
               String $$10 = $$6.c($$8).t_();
               $$4 = a($$4, $$9, $$10);
            }
         }
      }

      if ($$4 != $$3) {
         $$1.a($$0, $$4, 2);
      }

      return $$4;
   }

   private static <T extends Comparable<T>> dlf a(dlf $$0, dmi<T> $$1, String $$2) {
      return $$1.b($$2).map($$2x -> $$0.a($$1, $$2x)).orElse($$0);
   }

   protected boolean b(crg $$0, dlf $$1) {
      chh $$2 = $$0.o();
      enx $$3 = $$2 == null ? enx.a() : enx.a($$2);
      return (!this.d() || $$1.a((cvq)$$0.q(), $$0.a())) && $$0.q().a($$1, $$0.a(), $$3);
   }

   protected boolean d() {
      return true;
   }

   protected boolean a(crg $$0, dlf $$1) {
      return $$0.q().a($$0.a(), $$1, 11);
   }

   public static boolean a(cvn $$0, @Nullable chh $$1, hz $$2, coz $$3) {
      MinecraftServer $$4 = $$0.o();
      if ($$4 == null) {
         return false;
      } else {
         sw $$5 = a($$3);
         if ($$5 != null) {
            dit $$6 = $$0.c_($$2);
            if ($$6 != null) {
               if (!$$0.B && $$6.u() && ($$1 == null || !$$1.gq())) {
                  return false;
               }

               sw $$7 = $$6.q();
               sw $$8 = $$7.h();
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
   public void a(coz $$0, @Nullable cvn $$1, List<vq> $$2, cqq $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.e().a($$0, $$1, $$2, $$3);
   }

   public cyo e() {
      return this.c;
   }

   public void a(Map<cyo, cou> $$0, cou $$1) {
      $$0.put(this.e(), $$1);
   }

   @Override
   public boolean ar_() {
      return !(this.c instanceof dfm);
   }

   @Override
   public void a(cds $$0) {
      if (this.c instanceof dfm) {
         coz $$1 = $$0.q();
         sw $$2 = a($$1);
         if ($$2 != null && $$2.b("Items", 9)) {
            tc $$3 = $$2.c("Items", 10);
            cpb.a($$0, $$3.stream().map(sw.class::cast).map(coz::a));
         }
      }
   }

   @Nullable
   public static sw a(coz $$0) {
      return $$0.b("BlockEntityTag");
   }

   public static void a(coz $$0, div<?> $$1, sw $$2) {
      if ($$2.g()) {
         $$0.c("BlockEntityTag");
      } else {
         dit.a($$2, $$1);
         $$0.a("BlockEntityTag", $$2);
      }
   }

   @Override
   public cjs m() {
      return this.e().m();
   }
}
