import java.util.List;
import javax.annotation.Nullable;

public abstract class fim<E extends fim.a<E>> extends fib<E> {
   public fim(fgi $$0, int $$1, int $$2, int $$3, int $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   @Override
   public fhq a(fmi $$0) {
      if (this.l() == 0) {
         return null;
      } else if (!($$0 instanceof fmi.a $$1)) {
         return super.a($$0);
      } else {
         E $$2 = this.j();
         if ($$1.b().a() == fmj.a && $$2 != null) {
            return fhq.a(this, $$2.a($$0));
         } else {
            int $$3 = -1;
            fmk $$4 = $$1.b();
            if ($$2 != null) {
               $$3 = $$2.aG_().indexOf($$2.aJ_());
            }

            if ($$3 == -1) {
               switch ($$4) {
                  case c:
                     $$3 = Integer.MAX_VALUE;
                     $$4 = fmk.b;
                     break;
                  case d:
                     $$3 = 0;
                     $$4 = fmk.b;
                     break;
                  default:
                     $$3 = 0;
               }
            }

            E $$5 = $$2;

            fhq $$6;
            do {
               $$5 = this.a($$4, $$0x -> !$$0x.aG_().isEmpty(), $$5);
               if ($$5 == null) {
                  return null;
               }

               $$6 = $$5.a($$1, $$3);
            } while ($$6 == null);

            return fhq.a(this, $$6);
         }
      }
   }

   @Override
   public void a(@Nullable fkc $$0) {
      if (this.j() != $$0) {
         super.a($$0);
         if ($$0 == null) {
            this.a(null);
         }
      }
   }

   @Override
   public fma.a u() {
      return this.aK_() ? fma.a.c : super.u();
   }

   @Override
   protected boolean e(int $$0) {
      return false;
   }

   @Override
   public void a(fmc $$0) {
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

      $$0.a(fmb.d, wy.c("narration.component_list.usage"));
   }

   public abstract static class a<E extends fim.a<E>> extends fib.a<E> implements fkb {
      @Nullable
      private fkc a;
      @Nullable
      private fma b;
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
         return fkb.super.a($$0, $$1, $$2);
      }

      @Override
      public void a(@Nullable fkc $$0) {
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
      public fkc aJ_() {
         return this.a;
      }

      @Nullable
      public fhq a(fmi $$0, int $$1) {
         if (this.aG_().isEmpty()) {
            return null;
         } else {
            fhq $$2 = this.aG_().get(Math.min($$1, this.aG_().size() - 1)).a($$0);
            return fhq.a(this, $$2);
         }
      }

      @Nullable
      @Override
      public fhq a(fmi $$0) {
         if ($$0 instanceof fmi.a $$1) {
            int $$2 = switch ($$1.b()) {
               case c -> -1;
               case d -> 1;
               case a, b -> 0;
            };
            if ($$2 == 0) {
               return null;
            }

            int $$3 = ayn.a($$2 + this.aG_().indexOf(this.aJ_()), 0, this.aG_().size() - 1);

            for (int $$4 = $$3; $$4 >= 0 && $$4 < this.aG_().size(); $$4 += $$2) {
               fkc $$5 = this.aG_().get($$4);
               fhq $$6 = $$5.a($$0);
               if ($$6 != null) {
                  return fhq.a(this, $$6);
               }
            }
         }

         return fkb.super.a($$0);
      }

      public abstract List<? extends fma> b();

      void a(fmc $$0) {
         List<? extends fma> $$1 = this.b();
         fnx.b $$2 = fnx.a($$1, this.b);
         if ($$2 != null) {
            if ($$2.c.a()) {
               this.b = $$2.a;
            }

            if ($$1.size() > 1) {
               $$0.a(fmb.b, wy.a("narrator.position.object_list", $$2.b + 1, $$1.size()));
               if ($$2.c == fma.a.c) {
                  $$0.a(fmb.d, wy.c("narration.component_list.usage"));
               }
            }

            $$2.a.b($$0.a());
         }
      }
   }
}
