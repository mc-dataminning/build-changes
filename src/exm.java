import java.util.List;
import javax.annotation.Nullable;

public abstract class exm<E extends exm.a<E>> extends exb<E> {
   public exm(evi $$0, int $$1, int $$2, int $$3, int $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   @Override
   public ewr a(fbf $$0) {
      if (this.n() == 0) {
         return null;
      } else if (!($$0 instanceof fbf.a $$1)) {
         return super.a($$0);
      } else {
         E $$2 = this.k();
         if ($$1.b().a() == fbg.a && $$2 != null) {
            return ewr.a(this, $$2.a($$0));
         } else {
            int $$3 = -1;
            fbh $$4 = $$1.b();
            if ($$2 != null) {
               $$3 = $$2.l().indexOf($$2.aH_());
            }

            if ($$3 == -1) {
               switch ($$4) {
                  case c:
                     $$3 = Integer.MAX_VALUE;
                     $$4 = fbh.b;
                     break;
                  case d:
                     $$3 = 0;
                     $$4 = fbh.b;
                     break;
                  default:
                     $$3 = 0;
               }
            }

            E $$5 = $$2;

            ewr $$6;
            do {
               $$5 = this.a($$4, $$0x -> !$$0x.l().isEmpty(), $$5);
               if ($$5 == null) {
                  return null;
               }

               $$6 = $$5.a($$1, $$3);
            } while ($$6 == null);

            return ewr.a(this, $$6);
         }
      }
   }

   @Override
   public void a(@Nullable ezb $$0) {
      super.a($$0);
      if ($$0 == null) {
         this.a(null);
      }
   }

   @Override
   public fax.a s() {
      return this.aI_() ? fax.a.c : super.s();
   }

   @Override
   protected boolean e(int $$0) {
      return false;
   }

   @Override
   public void a(faz $$0) {
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

      $$0.a(fay.d, vf.c("narration.component_list.usage"));
   }

   public abstract static class a<E extends exm.a<E>> extends exb.a<E> implements eza {
      @Nullable
      private ezb a;
      @Nullable
      private fax b;
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
         return eza.super.a($$0, $$1, $$2);
      }

      @Override
      public void a(@Nullable ezb $$0) {
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
      public ezb aH_() {
         return this.a;
      }

      @Nullable
      public ewr a(fbf $$0, int $$1) {
         if (this.l().isEmpty()) {
            return null;
         } else {
            ewr $$2 = this.l().get(Math.min($$1, this.l().size() - 1)).a($$0);
            return ewr.a(this, $$2);
         }
      }

      @Nullable
      @Override
      public ewr a(fbf $$0) {
         if ($$0 instanceof fbf.a $$1) {
            int $$2 = switch ($$1.b()) {
               case c -> -1;
               case d -> 1;
               case a, b -> 0;
            };
            if ($$2 == 0) {
               return null;
            }

            int $$3 = auo.a($$2 + this.l().indexOf(this.aH_()), 0, this.l().size() - 1);

            for (int $$4 = $$3; $$4 >= 0 && $$4 < this.l().size(); $$4 += $$2) {
               ezb $$5 = this.l().get($$4);
               ewr $$6 = $$5.a($$0);
               if ($$6 != null) {
                  return ewr.a(this, $$6);
               }
            }
         }

         return eza.super.a($$0);
      }

      public abstract List<? extends fax> a();

      void a(faz $$0) {
         List<? extends fax> $$1 = this.a();
         fdb.b $$2 = fdb.a($$1, this.b);
         if ($$2 != null) {
            if ($$2.c.a()) {
               this.b = $$2.a;
            }

            if ($$1.size() > 1) {
               $$0.a(fay.b, vf.a("narrator.position.object_list", $$2.b + 1, $$1.size()));
               if ($$2.c == fax.a.c) {
                  $$0.a(fay.d, vf.c("narration.component_list.usage"));
               }
            }

            $$2.a.b($$0.a());
         }
      }
   }
}
