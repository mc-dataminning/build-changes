import java.util.List;
import javax.annotation.Nullable;

public abstract class exk<E extends exk.a<E>> extends ewz<E> {
   public exk(evg $$0, int $$1, int $$2, int $$3, int $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   @Override
   public ewp a(fbd $$0) {
      if (this.n() == 0) {
         return null;
      } else if (!($$0 instanceof fbd.a $$1)) {
         return super.a($$0);
      } else {
         E $$2 = this.k();
         if ($$1.b().a() == fbe.a && $$2 != null) {
            return ewp.a(this, $$2.a($$0));
         } else {
            int $$3 = -1;
            fbf $$4 = $$1.b();
            if ($$2 != null) {
               $$3 = $$2.l().indexOf($$2.aH_());
            }

            if ($$3 == -1) {
               switch ($$4) {
                  case c:
                     $$3 = Integer.MAX_VALUE;
                     $$4 = fbf.b;
                     break;
                  case d:
                     $$3 = 0;
                     $$4 = fbf.b;
                     break;
                  default:
                     $$3 = 0;
               }
            }

            E $$5 = $$2;

            ewp $$6;
            do {
               $$5 = this.a($$4, $$0x -> !$$0x.l().isEmpty(), $$5);
               if ($$5 == null) {
                  return null;
               }

               $$6 = $$5.a($$1, $$3);
            } while ($$6 == null);

            return ewp.a(this, $$6);
         }
      }
   }

   @Override
   public void a(@Nullable eyz $$0) {
      super.a($$0);
      if ($$0 == null) {
         this.a(null);
      }
   }

   @Override
   public fav.a s() {
      return this.aI_() ? fav.a.c : super.s();
   }

   @Override
   protected boolean e(int $$0) {
      return false;
   }

   @Override
   public void a(fax $$0) {
      E $$1 = this.t();
      if ($$1 != null) {
         $$1.a($$0.a());
         this.a($$0, $$1);
      } else {
         E $$2 = this.k();
         if ($$2 != null) {
            $$2.a($$0.a());
            this.a($$0, $$2);
         }
      }

      $$0.a(faw.d, vf.c("narration.component_list.usage"));
   }

   public abstract static class a<E extends exk.a<E>> extends ewz.a<E> implements eyy {
      @Nullable
      private eyz a;
      @Nullable
      private fav b;
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
         return eyy.super.a($$0, $$1, $$2);
      }

      @Override
      public void a(@Nullable eyz $$0) {
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
      public eyz aH_() {
         return this.a;
      }

      @Nullable
      public ewp a(fbd $$0, int $$1) {
         if (this.l().isEmpty()) {
            return null;
         } else {
            ewp $$2 = this.l().get(Math.min($$1, this.l().size() - 1)).a($$0);
            return ewp.a(this, $$2);
         }
      }

      @Nullable
      @Override
      public ewp a(fbd $$0) {
         if ($$0 instanceof fbd.a $$1) {
            int $$2 = switch ($$1.b()) {
               case c -> -1;
               case d -> 1;
               case a, b -> 0;
            };
            if ($$2 == 0) {
               return null;
            }

            int $$3 = aun.a($$2 + this.l().indexOf(this.aH_()), 0, this.l().size() - 1);

            for (int $$4 = $$3; $$4 >= 0 && $$4 < this.l().size(); $$4 += $$2) {
               eyz $$5 = this.l().get($$4);
               ewp $$6 = $$5.a($$0);
               if ($$6 != null) {
                  return ewp.a(this, $$6);
               }
            }
         }

         return eyy.super.a($$0);
      }

      public abstract List<? extends fav> a();

      void a(fax $$0) {
         List<? extends fav> $$1 = this.a();
         fcz.b $$2 = fcz.a($$1, this.b);
         if ($$2 != null) {
            if ($$2.c.a()) {
               this.b = $$2.a;
            }

            if ($$1.size() > 1) {
               $$0.a(faw.b, vf.a("narrator.position.object_list", $$2.b + 1, $$1.size()));
               if ($$2.c == fav.a.c) {
                  $$0.a(faw.d, vf.c("narration.component_list.usage"));
               }
            }

            $$2.a.b($$0.a());
         }
      }
   }
}
