import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class cof extends cqf {
   public static final String a = "BlockEntityTag";
   public static final String b = "BlockStateTag";
   @Deprecated
   private final daa c;

   public cof(daa $$0, cqf.a $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public bnc a(csu $$0) {
      bnc $$1 = this.a(new css($$0));
      if (!$$1.a() && this.v()) {
         bnc $$2 = this.a($$0.q(), $$0.o(), $$0.p()).a();
         return $$2 == bnc.b ? bnc.c : $$2;
      } else {
         return $$1;
      }
   }

   public bnc a(css $$0) {
      if (!this.d().a($$0.q().I())) {
         return bnc.e;
      } else if (!$$0.b()) {
         return bnc.e;
      } else {
         css $$1 = this.b($$0);
         if ($$1 == null) {
            return bnc.e;
         } else {
            dmz $$2 = this.c($$1);
            if ($$2 == null) {
               return bnc.e;
            } else if (!this.a($$1, $$2)) {
               return bnc.e;
            } else {
               ib $$3 = $$1.a();
               cwz $$4 = $$1.q();
               cis $$5 = $$1.o();
               cqk $$6 = $$1.n();
               dmz $$7 = $$4.a_($$3);
               if ($$7.a($$2.b())) {
                  $$7 = this.a($$3, $$4, $$6, $$7);
                  this.a($$3, $$4, $$5, $$6, $$7);
                  $$7.b().a($$4, $$3, $$7, $$5, $$6);
                  if ($$5 instanceof apg) {
                     am.z.a((apg)$$5, $$3, $$6);
                  }
               }

               dhm $$8 = $$7.w();
               $$4.a($$5, $$3, this.a($$7), atz.e, ($$8.a() + 1.0F) / 2.0F, $$8.b() * 0.8F);
               $$4.a(drn.i, $$3, drn.a.a($$5, $$7));
               $$6.a(1, $$5);
               return bnc.a($$4.B);
            }
         }
      }
   }

   protected atx a(dmz $$0) {
      return $$0.w().e();
   }

   @Nullable
   public css b(css $$0) {
      return $$0;
   }

   protected boolean a(ib $$0, cwz $$1, @Nullable cis $$2, cqk $$3, dmz $$4) {
      return a($$1, $$2, $$0, $$3);
   }

   @Nullable
   protected dmz c(css $$0) {
      dmz $$1 = this.d().a($$0);
      return $$1 != null && this.b($$0, $$1) ? $$1 : null;
   }

   private dmz a(ib $$0, cwz $$1, cqk $$2, dmz $$3) {
      dmz $$4 = $$3;
      ta $$5 = $$2.w();
      if ($$5 != null) {
         ta $$6 = $$5.p("BlockStateTag");
         dna<daa, dmz> $$7 = $$3.b().n();

         for (String $$8 : $$6.e()) {
            doc<?> $$9 = $$7.a($$8);
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

   private static <T extends Comparable<T>> dmz a(dmz $$0, doc<T> $$1, String $$2) {
      return $$1.b($$2).map($$2x -> $$0.a($$1, $$2x)).orElse($$0);
   }

   protected boolean b(css $$0, dmz $$1) {
      cis $$2 = $$0.o();
      epw $$3 = $$2 == null ? epw.a() : epw.a($$2);
      return (!this.c() || $$1.a((cxc)$$0.q(), $$0.a())) && $$0.q().a($$1, $$0.a(), $$3);
   }

   protected boolean c() {
      return true;
   }

   protected boolean a(css $$0, dmz $$1) {
      return $$0.q().a($$0.a(), $$1, 11);
   }

   public static boolean a(cwz $$0, @Nullable cis $$1, ib $$2, cqk $$3) {
      MinecraftServer $$4 = $$0.o();
      if ($$4 == null) {
         return false;
      } else {
         ta $$5 = a($$3);
         if ($$5 != null) {
            dkg $$6 = $$0.c_($$2);
            if ($$6 != null) {
               if (!$$0.B && $$6.q() && ($$1 == null || !$$1.gw())) {
                  return false;
               }

               ta $$7 = $$6.d($$0.H_());
               ta $$8 = $$7.h();
               $$7.a($$5);
               if (!$$7.equals($$8)) {
                  $$6.a($$7, $$0.H_());
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
      return this.d().g();
   }

   @Override
   public void a(cqk $$0, @Nullable cwz $$1, List<vu> $$2, csb $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.d().a($$0, $$1, $$2, $$3, $$1 != null ? $$1.H_() : null);
   }

   public daa d() {
      return this.c;
   }

   public void a(Map<daa, cqf> $$0, cqf $$1) {
      $$0.put(this.d(), $$1);
   }

   @Override
   public boolean ap_() {
      return !(this.c instanceof dgy);
   }

   @Override
   public void a(cfd $$0) {
      if (this.c instanceof dgy) {
         cqk $$1 = $$0.p();
         ta $$2 = a($$1);
         if ($$2 != null && $$2.b("Items", 9)) {
            tg $$3 = $$2.c("Items", 10);
            cqm.a($$0, $$3.stream().map(ta.class::cast).map(cqk::a));
         }
      }
   }

   @Nullable
   public static ta a(cqk $$0) {
      return $$0.c("BlockEntityTag");
   }

   public static void a(cqk $$0, dki<?> $$1, ta $$2) {
      if ($$2.g()) {
         $$0.d("BlockEntityTag");
      } else {
         dkg.a($$2, $$1);
         $$0.a("BlockEntityTag", $$2);
      }
   }

   @Override
   public clf m() {
      return this.d().m();
   }
}
