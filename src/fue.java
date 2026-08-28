import java.util.List;
import javax.annotation.Nullable;

public abstract class fue<E extends fue.a<E>> extends fts<E> {
   public fue(fqq $$0, int $$1, int $$2, int $$3, int $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   public fue(fqq $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public fth a(fyb $$0) {
      if (this.t() == 0) {
         return null;
      } else if (!($$0 instanceof fyb.a $$1)) {
         return super.a($$0);
      } else {
         E $$2 = this.r();
         if ($$1.b().a() == fyc.a && $$2 != null) {
            return fth.a(this, $$2.a($$0));
         } else {
            int $$3 = -1;
            fyd $$4 = $$1.b();
            if ($$2 != null) {
               $$3 = $$2.aJ_().indexOf($$2.aN_());
            }

            if ($$3 == -1) {
               switch ($$4) {
                  case c:
                     $$3 = Integer.MAX_VALUE;
                     $$4 = fyd.b;
                     break;
                  case d:
                     $$3 = 0;
                     $$4 = fyd.b;
                     break;
                  default:
                     $$3 = 0;
               }
            }

            E $$5 = $$2;

            fth $$6;
            do {
               $$5 = this.a($$4, $$0x -> !$$0x.aJ_().isEmpty(), $$5);
               if ($$5 == null) {
                  return null;
               }

               $$6 = $$5.a($$1, $$3);
            } while ($$6 == null);

            return fth.a(this, $$6);
         }
      }
   }

   @Override
   public void a(@Nullable fvv $$0) {
      if (this.r() != $$0) {
         super.a($$0);
         if ($$0 == null) {
            this.a(null);
         }
      }
   }

   @Override
   public fxt.a w() {
      return this.aO_() ? fxt.a.c : super.w();
   }

   @Override
   protected boolean c(int $$0) {
      return false;
   }

   @Override
   public void a(fxv $$0) {
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

      $$0.a(fxu.d, xg.c("narration.component_list.usage"));
   }

   public abstract static class a<E extends fue.a<E>> extends fts.a<E> implements fvu {
      @Nullable
      private fvv a;
      @Nullable
      private fxt b;
      private boolean c;

      @Override
      public boolean aM_() {
         return this.c;
      }

      @Override
      public void b_(boolean $$0) {
         this.c = $$0;
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         return fvu.super.a($$0, $$1, $$2);
      }

      @Override
      public void a(@Nullable fvv $$0) {
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
      public fvv aN_() {
         return this.a;
      }

      @Nullable
      public fth a(fyb $$0, int $$1) {
         if (this.aJ_().isEmpty()) {
            return null;
         } else {
            fth $$2 = this.aJ_().get(Math.min($$1, this.aJ_().size() - 1)).a($$0);
            return fth.a(this, $$2);
         }
      }

      @Nullable
      @Override
      public fth a(fyb $$0) {
         if ($$0 instanceof fyb.a $$1) {
            int $$2 = switch ($$1.b()) {
               case c -> -1;
               case d -> 1;
               case a, b -> 0;
            };
            if ($$2 == 0) {
               return null;
            }

            int $$3 = azz.a($$2 + this.aJ_().indexOf(this.aN_()), 0, this.aJ_().size() - 1);

            for (int $$4 = $$3; $$4 >= 0 && $$4 < this.aJ_().size(); $$4 += $$2) {
               fvv $$5 = this.aJ_().get($$4);
               fth $$6 = $$5.a($$0);
               if ($$6 != null) {
                  return fth.a(this, $$6);
               }
            }
         }

         return fvu.super.a($$0);
      }

      public abstract List<? extends fxt> b();

      void a(fxv $$0) {
         List<? extends fxt> $$1 = this.b();
         fzq.b $$2 = fzq.a($$1, this.b);
         if ($$2 != null) {
            if ($$2.c.a()) {
               this.b = $$2.a;
            }

            if ($$1.size() > 1) {
               $$0.a(fxu.b, xg.a("narrator.position.object_list", $$2.b + 1, $$1.size()));
               if ($$2.c == fxt.a.c) {
                  $$0.a(fxu.d, xg.c("narration.component_list.usage"));
               }
            }

            $$2.a.b($$0.a());
         }
      }
   }
}
