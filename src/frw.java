import java.util.List;
import javax.annotation.Nullable;

public abstract class frw<E extends frw.a<E>> extends frk<E> {
   public frw(fof $$0, int $$1, int $$2, int $$3, int $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   public frw(fof $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public fqz a(fvt $$0) {
      if (this.t() == 0) {
         return null;
      } else if (!($$0 instanceof fvt.a $$1)) {
         return super.a($$0);
      } else {
         E $$2 = this.r();
         if ($$1.b().a() == fvu.a && $$2 != null) {
            return fqz.a(this, $$2.a($$0));
         } else {
            int $$3 = -1;
            fvv $$4 = $$1.b();
            if ($$2 != null) {
               $$3 = $$2.aD_().indexOf($$2.aH_());
            }

            if ($$3 == -1) {
               switch ($$4) {
                  case c:
                     $$3 = Integer.MAX_VALUE;
                     $$4 = fvv.b;
                     break;
                  case d:
                     $$3 = 0;
                     $$4 = fvv.b;
                     break;
                  default:
                     $$3 = 0;
               }
            }

            E $$5 = $$2;

            fqz $$6;
            do {
               $$5 = this.a($$4, $$0x -> !$$0x.aD_().isEmpty(), $$5);
               if ($$5 == null) {
                  return null;
               }

               $$6 = $$5.a($$1, $$3);
            } while ($$6 == null);

            return fqz.a(this, $$6);
         }
      }
   }

   @Override
   public void a(@Nullable ftn $$0) {
      if (this.r() != $$0) {
         super.a($$0);
         if ($$0 == null) {
            this.a(null);
         }
      }
   }

   @Override
   public fvl.a w() {
      return this.aI_() ? fvl.a.c : super.w();
   }

   @Override
   protected boolean c(int $$0) {
      return false;
   }

   @Override
   public void a(fvn $$0) {
      E $$1 = this.x();
      if ($$1 != null) {
         $$1.a($$0.a());
         this.a($$0, $$1);
      } else {
         E $$2 = this.r();
         if ($$2 != null) {
            $$2.a($$0.a());
            this.a($$0, $$2);
         }
      }

      $$0.a(fvm.d, ww.c("narration.component_list.usage"));
   }

   public abstract static class a<E extends frw.a<E>> extends frk.a<E> implements ftm {
      @Nullable
      private ftn a;
      @Nullable
      private fvl b;
      private boolean c;

      @Override
      public boolean aG_() {
         return this.c;
      }

      @Override
      public void b_(boolean $$0) {
         this.c = $$0;
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         return ftm.super.a($$0, $$1, $$2);
      }

      @Override
      public void a(@Nullable ftn $$0) {
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
      public ftn aH_() {
         return this.a;
      }

      @Nullable
      public fqz a(fvt $$0, int $$1) {
         if (this.aD_().isEmpty()) {
            return null;
         } else {
            fqz $$2 = this.aD_().get(Math.min($$1, this.aD_().size() - 1)).a($$0);
            return fqz.a(this, $$2);
         }
      }

      @Nullable
      @Override
      public fqz a(fvt $$0) {
         if ($$0 instanceof fvt.a $$1) {
            int $$2 = switch ($$1.b()) {
               case c -> -1;
               case d -> 1;
               case a, b -> 0;
            };
            if ($$2 == 0) {
               return null;
            }

            int $$3 = azk.a($$2 + this.aD_().indexOf(this.aH_()), 0, this.aD_().size() - 1);

            for (int $$4 = $$3; $$4 >= 0 && $$4 < this.aD_().size(); $$4 += $$2) {
               ftn $$5 = this.aD_().get($$4);
               fqz $$6 = $$5.a($$0);
               if ($$6 != null) {
                  return fqz.a(this, $$6);
               }
            }
         }

         return ftm.super.a($$0);
      }

      public abstract List<? extends fvl> b();

      void a(fvn $$0) {
         List<? extends fvl> $$1 = this.b();
         fxi.b $$2 = fxi.a($$1, this.b);
         if ($$2 != null) {
            if ($$2.c.a()) {
               this.b = $$2.a;
            }

            if ($$1.size() > 1) {
               $$0.a(fvm.b, ww.a("narrator.position.object_list", $$2.b + 1, $$1.size()));
               if ($$2.c == fvl.a.c) {
                  $$0.a(fvm.d, ww.c("narration.component_list.usage"));
               }
            }

            $$2.a.b($$0.a());
         }
      }
   }
}
