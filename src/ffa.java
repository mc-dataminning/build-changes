import java.util.List;
import javax.annotation.Nullable;

public abstract class ffa<E extends ffa.a<E>> extends fep<E> {
   public ffa(fcu $$0, int $$1, int $$2, int $$3, int $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   @Override
   public fee a(fiw $$0) {
      if (this.l() == 0) {
         return null;
      } else if (!($$0 instanceof fiw.a $$1)) {
         return super.a($$0);
      } else {
         E $$2 = this.j();
         if ($$1.b().a() == fix.a && $$2 != null) {
            return fee.a(this, $$2.a($$0));
         } else {
            int $$3 = -1;
            fiy $$4 = $$1.b();
            if ($$2 != null) {
               $$3 = $$2.aE_().indexOf($$2.aH_());
            }

            if ($$3 == -1) {
               switch ($$4) {
                  case c:
                     $$3 = Integer.MAX_VALUE;
                     $$4 = fiy.b;
                     break;
                  case d:
                     $$3 = 0;
                     $$4 = fiy.b;
                     break;
                  default:
                     $$3 = 0;
               }
            }

            E $$5 = $$2;

            fee $$6;
            do {
               $$5 = this.a($$4, $$0x -> !$$0x.aE_().isEmpty(), $$5);
               if ($$5 == null) {
                  return null;
               }

               $$6 = $$5.a($$1, $$3);
            } while ($$6 == null);

            return fee.a(this, $$6);
         }
      }
   }

   @Override
   public void a(@Nullable fgq $$0) {
      super.a($$0);
      if ($$0 == null) {
         this.a(null);
      }
   }

   @Override
   public fio.a t() {
      return this.aI_() ? fio.a.c : super.t();
   }

   @Override
   protected boolean e(int $$0) {
      return false;
   }

   @Override
   public void a(fiq $$0) {
      E $$1 = this.u();
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

      $$0.a(fip.d, ws.c("narration.component_list.usage"));
   }

   public abstract static class a<E extends ffa.a<E>> extends fep.a<E> implements fgp {
      @Nullable
      private fgq a;
      @Nullable
      private fio b;
      private boolean c;

      @Override
      public boolean aG_() {
         return this.c;
      }

      @Override
      public void b(boolean $$0) {
         this.c = $$0;
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         return fgp.super.a($$0, $$1, $$2);
      }

      @Override
      public void a(@Nullable fgq $$0) {
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
      public fgq aH_() {
         return this.a;
      }

      @Nullable
      public fee a(fiw $$0, int $$1) {
         if (this.aE_().isEmpty()) {
            return null;
         } else {
            fee $$2 = this.aE_().get(Math.min($$1, this.aE_().size() - 1)).a($$0);
            return fee.a(this, $$2);
         }
      }

      @Nullable
      @Override
      public fee a(fiw $$0) {
         if ($$0 instanceof fiw.a $$1) {
            int $$2 = switch ($$1.b()) {
               case c -> -1;
               case d -> 1;
               case a, b -> 0;
            };
            if ($$2 == 0) {
               return null;
            }

            int $$3 = axw.a($$2 + this.aE_().indexOf(this.aH_()), 0, this.aE_().size() - 1);

            for (int $$4 = $$3; $$4 >= 0 && $$4 < this.aE_().size(); $$4 += $$2) {
               fgq $$5 = this.aE_().get($$4);
               fee $$6 = $$5.a($$0);
               if ($$6 != null) {
                  return fee.a(this, $$6);
               }
            }
         }

         return fgp.super.a($$0);
      }

      public abstract List<? extends fio> b();

      void a(fiq $$0) {
         List<? extends fio> $$1 = this.b();
         fkt.b $$2 = fkt.a($$1, this.b);
         if ($$2 != null) {
            if ($$2.c.a()) {
               this.b = $$2.a;
            }

            if ($$1.size() > 1) {
               $$0.a(fip.b, ws.a("narrator.position.object_list", $$2.b + 1, $$1.size()));
               if ($$2.c == fio.a.c) {
                  $$0.a(fip.d, ws.c("narration.component_list.usage"));
               }
            }

            $$2.a.b($$0.a());
         }
      }
   }
}
