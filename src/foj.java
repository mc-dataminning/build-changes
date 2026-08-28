import java.util.List;
import javax.annotation.Nullable;

public abstract class foj<E extends foj.a<E>> extends fny<E> {
   public foj(fme $$0, int $$1, int $$2, int $$3, int $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   @Override
   public fnn a(fsh $$0) {
      if (this.k() == 0) {
         return null;
      } else if (!($$0 instanceof fsh.a $$1)) {
         return super.a($$0);
      } else {
         E $$2 = this.i();
         if ($$1.b().a() == fsi.a && $$2 != null) {
            return fnn.a(this, $$2.a($$0));
         } else {
            int $$3 = -1;
            fsj $$4 = $$1.b();
            if ($$2 != null) {
               $$3 = $$2.aI_().indexOf($$2.aM_());
            }

            if ($$3 == -1) {
               switch ($$4) {
                  case c:
                     $$3 = Integer.MAX_VALUE;
                     $$4 = fsj.b;
                     break;
                  case d:
                     $$3 = 0;
                     $$4 = fsj.b;
                     break;
                  default:
                     $$3 = 0;
               }
            }

            E $$5 = $$2;

            fnn $$6;
            do {
               $$5 = this.a($$4, $$0x -> !$$0x.aI_().isEmpty(), $$5);
               if ($$5 == null) {
                  return null;
               }

               $$6 = $$5.a($$1, $$3);
            } while ($$6 == null);

            return fnn.a(this, $$6);
         }
      }
   }

   @Override
   public void a(@Nullable fqb $$0) {
      if (this.i() != $$0) {
         super.a($$0);
         if ($$0 == null) {
            this.a(null);
         }
      }
   }

   @Override
   public frz.a u() {
      return this.aN_() ? frz.a.c : super.u();
   }

   @Override
   protected boolean c(int $$0) {
      return false;
   }

   @Override
   public void a(fsb $$0) {
      E $$1 = this.v();
      if ($$1 != null) {
         $$1.a($$0.a());
         this.a($$0, $$1);
      } else {
         E $$2 = this.i();
         if ($$2 != null) {
            $$2.a($$0.a());
            this.a($$0, $$2);
         }
      }

      $$0.a(fsa.d, xv.c("narration.component_list.usage"));
   }

   public abstract static class a<E extends foj.a<E>> extends fny.a<E> implements fqa {
      @Nullable
      private fqb a;
      @Nullable
      private frz b;
      private boolean c;

      @Override
      public boolean aL_() {
         return this.c;
      }

      @Override
      public void b_(boolean $$0) {
         this.c = $$0;
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         return fqa.super.a($$0, $$1, $$2);
      }

      @Override
      public void a(@Nullable fqb $$0) {
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
      public fqb aM_() {
         return this.a;
      }

      @Nullable
      public fnn a(fsh $$0, int $$1) {
         if (this.aI_().isEmpty()) {
            return null;
         } else {
            fnn $$2 = this.aI_().get(Math.min($$1, this.aI_().size() - 1)).a($$0);
            return fnn.a(this, $$2);
         }
      }

      @Nullable
      @Override
      public fnn a(fsh $$0) {
         if ($$0 instanceof fsh.a $$1) {
            int $$2 = switch ($$1.b()) {
               case c -> -1;
               case d -> 1;
               case a, b -> 0;
            };
            if ($$2 == 0) {
               return null;
            }

            int $$3 = bae.a($$2 + this.aI_().indexOf(this.aM_()), 0, this.aI_().size() - 1);

            for (int $$4 = $$3; $$4 >= 0 && $$4 < this.aI_().size(); $$4 += $$2) {
               fqb $$5 = this.aI_().get($$4);
               fnn $$6 = $$5.a($$0);
               if ($$6 != null) {
                  return fnn.a(this, $$6);
               }
            }
         }

         return fqa.super.a($$0);
      }

      public abstract List<? extends frz> b();

      void a(fsb $$0) {
         List<? extends frz> $$1 = this.b();
         ftw.b $$2 = ftw.a($$1, this.b);
         if ($$2 != null) {
            if ($$2.c.a()) {
               this.b = $$2.a;
            }

            if ($$1.size() > 1) {
               $$0.a(fsa.b, xv.a("narrator.position.object_list", $$2.b + 1, $$1.size()));
               if ($$2.c == frz.a.c) {
                  $$0.a(fsa.d, xv.c("narration.component_list.usage"));
               }
            }

            $$2.a.b($$0.a());
         }
      }
   }
}
