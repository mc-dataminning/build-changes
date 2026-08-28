import java.util.List;
import javax.annotation.Nullable;

public abstract class fhy<E extends fhy.a<E>> extends fhn<E> {
   public fhy(fft $$0, int $$1, int $$2, int $$3, int $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   @Override
   public fhc a(flu $$0) {
      if (this.l() == 0) {
         return null;
      } else if (!($$0 instanceof flu.a $$1)) {
         return super.a($$0);
      } else {
         E $$2 = this.j();
         if ($$1.b().a() == flv.a && $$2 != null) {
            return fhc.a(this, $$2.a($$0));
         } else {
            int $$3 = -1;
            flw $$4 = $$1.b();
            if ($$2 != null) {
               $$3 = $$2.aG_().indexOf($$2.aJ_());
            }

            if ($$3 == -1) {
               switch ($$4) {
                  case c:
                     $$3 = Integer.MAX_VALUE;
                     $$4 = flw.b;
                     break;
                  case d:
                     $$3 = 0;
                     $$4 = flw.b;
                     break;
                  default:
                     $$3 = 0;
               }
            }

            E $$5 = $$2;

            fhc $$6;
            do {
               $$5 = this.a($$4, $$0x -> !$$0x.aG_().isEmpty(), $$5);
               if ($$5 == null) {
                  return null;
               }

               $$6 = $$5.a($$1, $$3);
            } while ($$6 == null);

            return fhc.a(this, $$6);
         }
      }
   }

   @Override
   public void a(@Nullable fjo $$0) {
      if (this.j() != $$0) {
         super.a($$0);
         if ($$0 == null) {
            this.a(null);
         }
      }
   }

   @Override
   public flm.a u() {
      return this.aK_() ? flm.a.c : super.u();
   }

   @Override
   protected boolean e(int $$0) {
      return false;
   }

   @Override
   public void a(flo $$0) {
      E $$1 = this.v();
      if ($$1 != null) {
         $$1.a($$0.a());
         this.a($$0, $$1);
      } else {
         E $$2 = this.j();
         if ($$2 != null) {
            $$2.a($$0.a());
            this.a($$0, $$2);
         }
      }

      $$0.a(fln.d, wu.c("narration.component_list.usage"));
   }

   public abstract static class a<E extends fhy.a<E>> extends fhn.a<E> implements fjn {
      @Nullable
      private fjo a;
      @Nullable
      private flm b;
      private boolean c;

      @Override
      public boolean aI_() {
         return this.c;
      }

      @Override
      public void b_(boolean $$0) {
         this.c = $$0;
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         return fjn.super.a($$0, $$1, $$2);
      }

      @Override
      public void a(@Nullable fjo $$0) {
         if (this.a != null) {
            this.a.a(false);
         }

         if ($$0 != null) {
            $$0.a(true);
         }

         this.a = $$0;
      }

      @Nullable
      @Override
      public fjo aJ_() {
         return this.a;
      }

      @Nullable
      public fhc a(flu $$0, int $$1) {
         if (this.aG_().isEmpty()) {
            return null;
         } else {
            fhc $$2 = this.aG_().get(Math.min($$1, this.aG_().size() - 1)).a($$0);
            return fhc.a(this, $$2);
         }
      }

      @Nullable
      @Override
      public fhc a(flu $$0) {
         if ($$0 instanceof flu.a $$1) {
            int $$2 = switch ($$1.b()) {
               case c -> -1;
               case d -> 1;
               case a, b -> 0;
            };
            if ($$2 == 0) {
               return null;
            }

            int $$3 = ayg.a($$2 + this.aG_().indexOf(this.aJ_()), 0, this.aG_().size() - 1);

            for (int $$4 = $$3; $$4 >= 0 && $$4 < this.aG_().size(); $$4 += $$2) {
               fjo $$5 = this.aG_().get($$4);
               fhc $$6 = $$5.a($$0);
               if ($$6 != null) {
                  return fhc.a(this, $$6);
               }
            }
         }

         return fjn.super.a($$0);
      }

      public abstract List<? extends flm> b();

      void a(flo $$0) {
         List<? extends flm> $$1 = this.b();
         fnj.b $$2 = fnj.a($$1, this.b);
         if ($$2 != null) {
            if ($$2.c.a()) {
               this.b = $$2.a;
            }

            if ($$1.size() > 1) {
               $$0.a(fln.b, wu.a("narrator.position.object_list", $$2.b + 1, $$1.size()));
               if ($$2.c == flm.a.c) {
                  $$0.a(fln.d, wu.c("narration.component_list.usage"));
               }
            }

            $$2.a.b($$0.a());
         }
      }
   }
}
