import java.util.List;
import javax.annotation.Nullable;

public abstract class fgf<E extends fgf.a<E>> extends ffu<E> {
   public fgf(fdz $$0, int $$1, int $$2, int $$3, int $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   @Override
   public ffj a(fkb $$0) {
      if (this.l() == 0) {
         return null;
      } else if (!($$0 instanceof fkb.a $$1)) {
         return super.a($$0);
      } else {
         E $$2 = this.j();
         if ($$1.b().a() == fkc.a && $$2 != null) {
            return ffj.a(this, $$2.a($$0));
         } else {
            int $$3 = -1;
            fkd $$4 = $$1.b();
            if ($$2 != null) {
               $$3 = $$2.aE_().indexOf($$2.aH_());
            }

            if ($$3 == -1) {
               switch ($$4) {
                  case c:
                     $$3 = Integer.MAX_VALUE;
                     $$4 = fkd.b;
                     break;
                  case d:
                     $$3 = 0;
                     $$4 = fkd.b;
                     break;
                  default:
                     $$3 = 0;
               }
            }

            E $$5 = $$2;

            ffj $$6;
            do {
               $$5 = this.a($$4, $$0x -> !$$0x.aE_().isEmpty(), $$5);
               if ($$5 == null) {
                  return null;
               }

               $$6 = $$5.a($$1, $$3);
            } while ($$6 == null);

            return ffj.a(this, $$6);
         }
      }
   }

   @Override
   public void a(@Nullable fhv $$0) {
      super.a($$0);
      if ($$0 == null) {
         this.a(null);
      }
   }

   @Override
   public fjt.a t() {
      return this.aI_() ? fjt.a.c : super.t();
   }

   @Override
   protected boolean e(int $$0) {
      return false;
   }

   @Override
   public void a(fjv $$0) {
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

      $$0.a(fju.d, wx.c("narration.component_list.usage"));
   }

   public abstract static class a<E extends fgf.a<E>> extends ffu.a<E> implements fhu {
      @Nullable
      private fhv a;
      @Nullable
      private fjt b;
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
         return fhu.super.a($$0, $$1, $$2);
      }

      @Override
      public void a(@Nullable fhv $$0) {
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
      public fhv aH_() {
         return this.a;
      }

      @Nullable
      public ffj a(fkb $$0, int $$1) {
         if (this.aE_().isEmpty()) {
            return null;
         } else {
            ffj $$2 = this.aE_().get(Math.min($$1, this.aE_().size() - 1)).a($$0);
            return ffj.a(this, $$2);
         }
      }

      @Nullable
      @Override
      public ffj a(fkb $$0) {
         if ($$0 instanceof fkb.a $$1) {
            int $$2 = switch ($$1.b()) {
               case c -> -1;
               case d -> 1;
               case a, b -> 0;
            };
            if ($$2 == 0) {
               return null;
            }

            int $$3 = ayd.a($$2 + this.aE_().indexOf(this.aH_()), 0, this.aE_().size() - 1);

            for (int $$4 = $$3; $$4 >= 0 && $$4 < this.aE_().size(); $$4 += $$2) {
               fhv $$5 = this.aE_().get($$4);
               ffj $$6 = $$5.a($$0);
               if ($$6 != null) {
                  return ffj.a(this, $$6);
               }
            }
         }

         return fhu.super.a($$0);
      }

      public abstract List<? extends fjt> b();

      void a(fjv $$0) {
         List<? extends fjt> $$1 = this.b();
         fly.b $$2 = fly.a($$1, this.b);
         if ($$2 != null) {
            if ($$2.c.a()) {
               this.b = $$2.a;
            }

            if ($$1.size() > 1) {
               $$0.a(fju.b, wx.a("narrator.position.object_list", $$2.b + 1, $$1.size()));
               if ($$2.c == fjt.a.c) {
                  $$0.a(fju.d, wx.c("narration.component_list.usage"));
               }
            }

            $$2.a.b($$0.a());
         }
      }
   }
}
