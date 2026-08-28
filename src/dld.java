import com.mojang.serialization.MapCodec;

public class dld extends dew {
   public static final MapCodec<dld> d = b(dld::new);
   public static final dti<dto> e = dta.ah;
   public static final dtb f = dta.w;

   @Override
   public MapCodec<dld> a() {
      return d;
   }

   protected dld(dsj.d $$0) {
      super(true, $$0);
      this.k(this.E.b().a(e, dto.a).a(f, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   protected boolean a(dcf $$0, ja $$1, dsk $$2, boolean $$3, int $$4) {
      if ($$4 >= 8) {
         return false;
      } else {
         int $$5 = $$1.u();
         int $$6 = $$1.v();
         int $$7 = $$1.w();
         boolean $$8 = true;
         dto $$9 = $$2.c(e);
         switch ($$9) {
            case a:
               if ($$3) {
                  $$7++;
               } else {
                  $$7--;
               }
               break;
            case b:
               if ($$3) {
                  $$5--;
               } else {
                  $$5++;
               }
               break;
            case c:
               if ($$3) {
                  $$5--;
               } else {
                  $$5++;
                  $$6++;
                  $$8 = false;
               }

               $$9 = dto.b;
               break;
            case d:
               if ($$3) {
                  $$5--;
                  $$6++;
                  $$8 = false;
               } else {
                  $$5++;
               }

               $$9 = dto.b;
               break;
            case e:
               if ($$3) {
                  $$7++;
               } else {
                  $$7--;
                  $$6++;
                  $$8 = false;
               }

               $$9 = dto.a;
               break;
            case f:
               if ($$3) {
                  $$7++;
                  $$6++;
                  $$8 = false;
               } else {
                  $$7--;
               }

               $$9 = dto.a;
         }

         return this.a($$0, new ja($$5, $$6, $$7), $$3, $$4, $$9) ? true : $$8 && this.a($$0, new ja($$5, $$6 - 1, $$7), $$3, $$4, $$9);
      }
   }

   protected boolean a(dcf $$0, ja $$1, boolean $$2, int $$3, dto $$4) {
      dsk $$5 = $$0.a_($$1);
      if (!$$5.a(this)) {
         return false;
      } else {
         dto $$6 = $$5.c(e);
         if ($$4 != dto.b || $$6 != dto.a && $$6 != dto.e && $$6 != dto.f) {
            if ($$4 != dto.a || $$6 != dto.b && $$6 != dto.c && $$6 != dto.d) {
               if (!$$5.c(f)) {
                  return false;
               } else {
                  return $$0.C($$1) ? true : this.a($$0, $$1, $$5, $$2, $$3 + 1);
               }
            } else {
               return false;
            }
         } else {
            return false;
         }
      }
   }

   @Override
   protected void a(dsk $$0, dcf $$1, ja $$2, dfh $$3) {
      boolean $$4 = $$0.c(f);
      boolean $$5 = $$1.C($$2) || this.a($$1, $$2, $$0, true, 0) || this.a($$1, $$2, $$0, false, 0);
      if ($$5 != $$4) {
         $$1.a($$2, $$0.a(f, Boolean.valueOf($$5)), 3);
         $$1.a($$2.d(), this);
         if ($$0.c(e).b()) {
            $$1.a($$2.c(), this);
         }
      }
   }

   @Override
   public dtn<dto> c() {
      return e;
   }

   @Override
   protected dsk a(dsk $$0, dlu $$1) {
      switch ($$1) {
         case c:
            switch ((dto)$$0.c(e)) {
               case c:
                  return $$0.a(e, dto.d);
               case d:
                  return $$0.a(e, dto.c);
               case e:
                  return $$0.a(e, dto.f);
               case f:
                  return $$0.a(e, dto.e);
               case g:
                  return $$0.a(e, dto.i);
               case h:
                  return $$0.a(e, dto.j);
               case i:
                  return $$0.a(e, dto.g);
               case j:
                  return $$0.a(e, dto.h);
            }
         case d:
            switch ((dto)$$0.c(e)) {
               case a:
                  return $$0.a(e, dto.b);
               case b:
                  return $$0.a(e, dto.a);
               case c:
                  return $$0.a(e, dto.e);
               case d:
                  return $$0.a(e, dto.f);
               case e:
                  return $$0.a(e, dto.d);
               case f:
                  return $$0.a(e, dto.c);
               case g:
                  return $$0.a(e, dto.j);
               case h:
                  return $$0.a(e, dto.g);
               case i:
                  return $$0.a(e, dto.h);
               case j:
                  return $$0.a(e, dto.i);
            }
         case b:
            switch ((dto)$$0.c(e)) {
               case a:
                  return $$0.a(e, dto.b);
               case b:
                  return $$0.a(e, dto.a);
               case c:
                  return $$0.a(e, dto.f);
               case d:
                  return $$0.a(e, dto.e);
               case e:
                  return $$0.a(e, dto.c);
               case f:
                  return $$0.a(e, dto.d);
               case g:
                  return $$0.a(e, dto.h);
               case h:
                  return $$0.a(e, dto.i);
               case i:
                  return $$0.a(e, dto.j);
               case j:
                  return $$0.a(e, dto.g);
            }
         default:
            return $$0;
      }
   }

   @Override
   protected dsk a(dsk $$0, dke $$1) {
      dto $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.a(e, dto.f);
               case f:
                  return $$0.a(e, dto.e);
               case g:
                  return $$0.a(e, dto.j);
               case h:
                  return $$0.a(e, dto.i);
               case i:
                  return $$0.a(e, dto.h);
               case j:
                  return $$0.a(e, dto.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.a(e, dto.d);
               case d:
                  return $$0.a(e, dto.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(e, dto.h);
               case h:
                  return $$0.a(e, dto.g);
               case i:
                  return $$0.a(e, dto.j);
               case j:
                  return $$0.a(e, dto.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(e, f, c);
   }
}
