import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class bim extends bhr<byb> {
   private static final int d = 200;
   public static final float c = 0.5F;
   @Nullable
   private gu e;
   private long f;
   private int g;
   private final List<gu> h = Lists.newArrayList();

   public bim() {
      super(ImmutableMap.of(bpb.n, bpc.b, bpb.m, bpc.b, bpb.f, bpc.a));
   }

   protected boolean a(aif $$0, byb $$1) {
      if (!$$0.X().b(cmi.c)) {
         return false;
      } else if ($$1.gj().b() != bye.g) {
         return false;
      } else {
         gu.a $$2 = $$1.di().j();
         this.h.clear();

         for (int $$3 = -1; $$3 <= 1; $$3++) {
            for (int $$4 = -1; $$4 <= 1; $$4++) {
               for (int $$5 = -1; $$5 <= 1; $$5++) {
                  $$2.b($$1.dn() + (double)$$3, $$1.dp() + (double)$$4, $$1.dt() + (double)$$5);
                  if (this.a($$2, $$0)) {
                     this.h.add(new gu($$2));
                  }
               }
            }
         }

         this.e = this.a($$0);
         return this.e != null;
      }
   }

   @Nullable
   private gu a(aif $$0) {
      return this.h.isEmpty() ? null : this.h.get($$0.y_().a(this.h.size()));
   }

   private boolean a(gu $$0, aif $$1) {
      dcb $$2 = $$1.a_($$0);
      cpn $$3 = $$2.b();
      cpn $$4 = $$1.a_($$0.d()).b();
      return $$3 instanceof cre && ((cre)$$3).h($$2) || $$2.i() && $$4 instanceof csg;
   }

   protected void a(aif $$0, byb $$1, long $$2) {
      if ($$2 > this.f && this.e != null) {
         $$1.dK().a(bpb.n, new bhu(this.e));
         $$1.dK().a(bpb.m, new bpe(new bhu(this.e), 0.5F, 1));
      }
   }

   protected void b(aif $$0, byb $$1, long $$2) {
      $$1.dK().b(bpb.n);
      $$1.dK().b(bpb.m);
      this.g = 0;
      this.f = $$2 + 40L;
   }

   protected void c(aif $$0, byb $$1, long $$2) {
      if (this.e == null || this.e.a($$1.dg(), 1.0)) {
         if (this.e != null && $$2 > this.f) {
            dcb $$3 = $$0.a_(this.e);
            cpn $$4 = $$3.b();
            cpn $$5 = $$0.a_(this.e.d()).b();
            if ($$4 instanceof cre && ((cre)$$4).h($$3)) {
               $$0.a(this.e, true, $$1);
            }

            if ($$3.i() && $$5 instanceof csg && $$1.gs()) {
               bee $$6 = $$1.w();

               for (int $$7 = 0; $$7 < $$6.b(); $$7++) {
                  cfz $$8 = $$6.a($$7);
                  boolean $$9 = false;
                  if (!$$8.b() && $$8.a(ane.aU) && $$8.d() instanceof cds $$10) {
                     dcb $$11 = $$10.e().n();
                     $$0.b(this.e, $$11);
                     $$0.a(dgl.i, this.e, dgl.a.a($$1, $$11));
                     $$9 = true;
                  }

                  if ($$9) {
                     $$0.a(null, (double)this.e.u(), (double)this.e.v(), (double)this.e.w(), amh.fi, ami.e, 1.0F, 1.0F);
                     $$8.h(1);
                     if ($$8.b()) {
                        $$6.a($$7, cfz.b);
                     }
                     break;
                  }
               }
            }

            if ($$4 instanceof cre && !((cre)$$4).h($$3)) {
               this.h.remove(this.e);
               this.e = this.a($$0);
               if (this.e != null) {
                  this.f = $$2 + 20L;
                  $$1.dK().a(bpb.m, new bpe(new bhu(this.e), 0.5F, 1));
                  $$1.dK().a(bpb.n, new bhu(this.e));
               }
            }
         }

         this.g++;
      }
   }

   protected boolean d(aif $$0, byb $$1, long $$2) {
      return this.g < 200;
   }
}
