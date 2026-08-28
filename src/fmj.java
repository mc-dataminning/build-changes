import java.util.List;
import javax.annotation.Nullable;

public abstract class fmj<E extends fmj.a<E>> extends fly<E> {
   public fmj(fke $$0, int $$1, int $$2, int $$3, int $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   @Override
   public fln a(fqh $$0) {
      if (this.l() == 0) {
         return null;
      } else if (!($$0 instanceof fqh.a $$1)) {
         return super.a($$0);
      } else {
         E $$2 = this.j();
         if ($$1.b().a() == fqi.a && $$2 != null) {
            return fln.a(this, $$2.a($$0));
         } else {
            int $$3 = -1;
            fqj $$4 = $$1.b();
            if ($$2 != null) {
               $$3 = $$2.aH_().indexOf($$2.aK_());
            }

            if ($$3 == -1) {
               switch ($$4) {
                  case c:
                     $$3 = Integer.MAX_VALUE;
                     $$4 = fqj.b;
                     break;
                  case d:
                     $$3 = 0;
                     $$4 = fqj.b;
                     break;
                  default:
                     $$3 = 0;
               }
            }

            E $$5 = $$2;

            fln $$6;
            do {
               $$5 = this.a($$4, $$0x -> !$$0x.aH_().isEmpty(), $$5);
               if ($$5 == null) {
                  return null;
               }

               $$6 = $$5.a($$1, $$3);
            } while ($$6 == null);

            return fln.a(this, $$6);
         }
      }
   }

   @Override
   public void a(@Nullable foa $$0) {
      if (this.j() != $$0) {
         super.a($$0);
         if ($$0 == null) {
            this.a(null);
         }
      }
   }

   @Override
   public fpz.a u() {
      return this.aL_() ? fpz.a.c : super.u();
   }

   @Override
   protected boolean e(int $$0) {
      return false;
   }

   @Override
   public void a(fqb $$0) {
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

      $$0.a(fqa.d, xj.c("narration.component_list.usage"));
   }

   public abstract static class a<E extends fmj.a<E>> extends fly.a<E> implements fnz {
      @Nullable
      private foa a;
      @Nullable
      private fpz b;
      private boolean c;

      @Override
      public boolean aJ_() {
         return this.c;
      }

      @Override
      public void b_(boolean $$0) {
         this.c = $$0;
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         return fnz.super.a($$0, $$1, $$2);
      }

      @Override
      public void a(@Nullable foa $$0) {
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
      public foa aK_() {
         return this.a;
      }

      @Nullable
      public fln a(fqh $$0, int $$1) {
         if (this.aH_().isEmpty()) {
            return null;
         } else {
            fln $$2 = this.aH_().get(Math.min($$1, this.aH_().size() - 1)).a($$0);
            return fln.a(this, $$2);
         }
      }

      @Nullable
      @Override
      public fln a(fqh $$0) {
         if ($$0 instanceof fqh.a $$1) {
            int $$2 = switch ($$1.b()) {
               case c -> -1;
               case d -> 1;
               case a, b -> 0;
            };
            if ($$2 == 0) {
               return null;
            }

            int $$3 = azm.a($$2 + this.aH_().indexOf(this.aK_()), 0, this.aH_().size() - 1);

            for (int $$4 = $$3; $$4 >= 0 && $$4 < this.aH_().size(); $$4 += $$2) {
               foa $$5 = this.aH_().get($$4);
               fln $$6 = $$5.a($$0);
               if ($$6 != null) {
                  return fln.a(this, $$6);
               }
            }
         }

         return fnz.super.a($$0);
      }

      public abstract List<? extends fpz> b();

      void a(fqb $$0) {
         List<? extends fpz> $$1 = this.b();
         frw.b $$2 = frw.a($$1, this.b);
         if ($$2 != null) {
            if ($$2.c.a()) {
               this.b = $$2.a;
            }

            if ($$1.size() > 1) {
               $$0.a(fqa.b, xj.a("narrator.position.object_list", $$2.b + 1, $$1.size()));
               if ($$2.c == fpz.a.c) {
                  $$0.a(fqa.d, xj.c("narration.component_list.usage"));
               }
            }

            $$2.a.b($$0.a());
         }
      }
   }
}
