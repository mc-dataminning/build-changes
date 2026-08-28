import java.util.List;
import javax.annotation.Nullable;

public abstract class fow<E extends fow.a<E>> extends foj<E> {
   public fow(flh $$0, int $$1, int $$2, int $$3, int $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   public fow(flh $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public fny a(fst $$0) {
      if (this.t() == 0) {
         return null;
      } else if (!($$0 instanceof fst.a $$1)) {
         return super.a($$0);
      } else {
         E $$2 = this.r();
         if ($$1.b().a() == fsu.a && $$2 != null) {
            return fny.a(this, $$2.a($$0));
         } else {
            int $$3 = -1;
            fsv $$4 = $$1.b();
            if ($$2 != null) {
               $$3 = $$2.aH_().indexOf($$2.aL_());
            }

            if ($$3 == -1) {
               switch ($$4) {
                  case c:
                     $$3 = Integer.MAX_VALUE;
                     $$4 = fsv.b;
                     break;
                  case d:
                     $$3 = 0;
                     $$4 = fsv.b;
                     break;
                  default:
                     $$3 = 0;
               }
            }

            E $$5 = $$2;

            fny $$6;
            do {
               $$5 = this.a($$4, $$0x -> !$$0x.aH_().isEmpty(), $$5);
               if ($$5 == null) {
                  return null;
               }

               $$6 = $$5.a($$1, $$3);
            } while ($$6 == null);

            return fny.a(this, $$6);
         }
      }
   }

   @Override
   public void a(@Nullable fqn $$0) {
      if (this.r() != $$0) {
         super.a($$0);
         if ($$0 == null) {
            this.a(null);
         }
      }
   }

   @Override
   public fsl.a w() {
      return this.aM_() ? fsl.a.c : super.w();
   }

   @Override
   protected boolean c(int $$0) {
      return false;
   }

   @Override
   public void a(fsn $$0) {
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

      $$0.a(fsm.d, wo.c("narration.component_list.usage"));
   }

   public abstract static class a<E extends fow.a<E>> extends foj.a<E> implements fqm {
      @Nullable
      private fqn a;
      @Nullable
      private fsl b;
      private boolean c;

      @Override
      public boolean aK_() {
         return this.c;
      }

      @Override
      public void b_(boolean $$0) {
         this.c = $$0;
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         return fqm.super.a($$0, $$1, $$2);
      }

      @Override
      public void a(@Nullable fqn $$0) {
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
      public fqn aL_() {
         return this.a;
      }

      @Nullable
      public fny a(fst $$0, int $$1) {
         if (this.aH_().isEmpty()) {
            return null;
         } else {
            fny $$2 = this.aH_().get(Math.min($$1, this.aH_().size() - 1)).a($$0);
            return fny.a(this, $$2);
         }
      }

      @Nullable
      @Override
      public fny a(fst $$0) {
         if ($$0 instanceof fst.a $$1) {
            int $$2 = switch ($$1.b()) {
               case c -> -1;
               case d -> 1;
               case a, b -> 0;
            };
            if ($$2 == 0) {
               return null;
            }

            int $$3 = ayy.a($$2 + this.aH_().indexOf(this.aL_()), 0, this.aH_().size() - 1);

            for (int $$4 = $$3; $$4 >= 0 && $$4 < this.aH_().size(); $$4 += $$2) {
               fqn $$5 = this.aH_().get($$4);
               fny $$6 = $$5.a($$0);
               if ($$6 != null) {
                  return fny.a(this, $$6);
               }
            }
         }

         return fqm.super.a($$0);
      }

      public abstract List<? extends fsl> b();

      void a(fsn $$0) {
         List<? extends fsl> $$1 = this.b();
         fui.b $$2 = fui.a($$1, this.b);
         if ($$2 != null) {
            if ($$2.c.a()) {
               this.b = $$2.a;
            }

            if ($$1.size() > 1) {
               $$0.a(fsm.b, wo.a("narrator.position.object_list", $$2.b + 1, $$1.size()));
               if ($$2.c == fsl.a.c) {
                  $$0.a(fsm.d, wo.c("narration.component_list.usage"));
               }
            }

            $$2.a.b($$0.a());
         }
      }
   }
}
