import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class btg extends bsl<cjn> {
   private static final int d = 200;
   public static final float c = 0.5F;
   @Nullable
   private id e;
   private long f;
   private int g;
   private final List<id> h = Lists.newArrayList();

   public btg() {
      super(ImmutableMap.of(bzw.n, bzx.b, bzw.m, bzx.b, bzw.f, bzx.a));
   }

   protected boolean a(apu $$0, cjn $$1) {
      if (!$$0.aa().b(czc.c)) {
         return false;
      } else if ($$1.gy().b() != cjq.g) {
         return false;
      } else {
         id.a $$2 = $$1.dm().j();
         this.h.clear();

         for (int $$3 = -1; $$3 <= 1; $$3++) {
            for (int $$4 = -1; $$4 <= 1; $$4++) {
               for (int $$5 = -1; $$5 <= 1; $$5++) {
                  $$2.b($$1.dr() + (double)$$3, $$1.dt() + (double)$$4, $$1.dx() + (double)$$5);
                  if (this.a($$2, $$0)) {
                     this.h.add(new id($$2));
                  }
               }
            }
         }

         this.e = this.a($$0);
         return this.e != null;
      }
   }

   @Nullable
   private id a(apu $$0) {
      return this.h.isEmpty() ? null : this.h.get($$0.E_().a(this.h.size()));
   }

   private boolean a(id $$0, apu $$1) {
      dpi $$2 = $$1.a_($$0);
      dch $$3 = $$2.b();
      dch $$4 = $$1.a_($$0.d()).b();
      return $$3 instanceof dec && ((dec)$$3).h($$2) || $$2.i() && $$4 instanceof dfe;
   }

   protected void a(apu $$0, cjn $$1, long $$2) {
      if ($$2 > this.f && this.e != null) {
         $$1.dP().a(bzw.n, new bso(this.e));
         $$1.dP().a(bzw.m, new bzz(new bso(this.e), 0.5F, 1));
      }
   }

   protected void b(apu $$0, cjn $$1, long $$2) {
      $$1.dP().b(bzw.n);
      $$1.dP().b(bzw.m);
      this.g = 0;
      this.f = $$2 + 40L;
   }

   protected void c(apu $$0, cjn $$1, long $$2) {
      if (this.e == null || this.e.a($$1.dk(), 1.0)) {
         if (this.e != null && $$2 > this.f) {
            dpi $$3 = $$0.a_(this.e);
            dch $$4 = $$3.b();
            dch $$5 = $$0.a_(this.e.d()).b();
            if ($$4 instanceof dec && ((dec)$$4).h($$3)) {
               $$0.a(this.e, true, $$1);
            }

            if ($$3.i() && $$5 instanceof dfe && $$1.gH()) {
               boo $$6 = $$1.y();

               for (int $$7 = 0; $$7 < $$6.b(); $$7++) {
                  crs $$8 = $$6.a($$7);
                  boolean $$9 = false;
                  if (!$$8.d() && $$8.a(avm.aZ) && $$8.f() instanceof cpq $$10) {
                     dpi $$11 = $$10.d().n();
                     $$0.b(this.e, $$11);
                     $$0.a(dub.i, this.e, dub.a.a($$1, $$11));
                     $$9 = true;
                  }

                  if ($$9) {
                     $$0.a(null, (double)this.e.u(), (double)this.e.v(), (double)this.e.w(), auo.gh, aup.e, 1.0F, 1.0F);
                     $$8.g(1);
                     if ($$8.d()) {
                        $$6.a($$7, crs.i);
                     }
                     break;
                  }
               }
            }

            if ($$4 instanceof dec && !((dec)$$4).h($$3)) {
               this.h.remove(this.e);
               this.e = this.a($$0);
               if (this.e != null) {
                  this.f = $$2 + 20L;
                  $$1.dP().a(bzw.m, new bzz(new bso(this.e), 0.5F, 1));
                  $$1.dP().a(bzw.n, new bso(this.e));
               }
            }
         }

         this.g++;
      }
   }

   protected boolean d(apu $$0, cjn $$1, long $$2) {
      return this.g < 200;
   }
}
