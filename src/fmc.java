import java.util.List;
import javax.annotation.Nullable;

public abstract class fmc<E extends fmc.a<E>> extends flr<E> {
   public fmc(fjx $$0, int $$1, int $$2, int $$3, int $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   @Override
   public flg a(fqa $$0) {
      if (this.l() == 0) {
         return null;
      } else if (!($$0 instanceof fqa.a $$1)) {
         return super.a($$0);
      } else {
         E $$2 = this.j();
         if ($$1.b().a() == fqb.a && $$2 != null) {
            return flg.a(this, $$2.a($$0));
         } else {
            int $$3 = -1;
            fqc $$4 = $$1.b();
            if ($$2 != null) {
               $$3 = $$2.aI_().indexOf($$2.aL_());
            }

            if ($$3 == -1) {
               switch ($$4) {
                  case c:
                     $$3 = Integer.MAX_VALUE;
                     $$4 = fqc.b;
                     break;
                  case d:
                     $$3 = 0;
                     $$4 = fqc.b;
                     break;
                  default:
                     $$3 = 0;
               }
            }

            E $$5 = $$2;

            flg $$6;
            do {
               $$5 = this.a($$4, $$0x -> !$$0x.aI_().isEmpty(), $$5);
               if ($$5 == null) {
                  return null;
               }

               $$6 = $$5.a($$1, $$3);
            } while ($$6 == null);

            return flg.a(this, $$6);
         }
      }
   }

   @Override
   public void a(@Nullable fnt $$0) {
      if (this.j() != $$0) {
         super.a($$0);
         if ($$0 == null) {
            this.a(null);
         }
      }
   }

   @Override
   public fps.a u() {
      return this.aM_() ? fps.a.c : super.u();
   }

   @Override
   protected boolean e(int $$0) {
      return false;
   }

   @Override
   public void a(fpu $$0) {
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

      $$0.a(fpt.d, xl.c("narration.component_list.usage"));
   }

   public abstract static class a<E extends fmc.a<E>> extends flr.a<E> implements fns {
      @Nullable
      private fnt a;
      @Nullable
      private fps b;
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
         return fns.super.a($$0, $$1, $$2);
      }

      @Override
      public void a(@Nullable fnt $$0) {
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
      public fnt aL_() {
         return this.a;
      }

      @Nullable
      public flg a(fqa $$0, int $$1) {
         if (this.aI_().isEmpty()) {
            return null;
         } else {
            flg $$2 = this.aI_().get(Math.min($$1, this.aI_().size() - 1)).a($$0);
            return flg.a(this, $$2);
         }
      }

      @Nullable
      @Override
      public flg a(fqa $$0) {
         if ($$0 instanceof fqa.a $$1) {
            int $$2 = switch ($$1.b()) {
               case c -> -1;
               case d -> 1;
               case a, b -> 0;
            };
            if ($$2 == 0) {
               return null;
            }

            int $$3 = azn.a($$2 + this.aI_().indexOf(this.aL_()), 0, this.aI_().size() - 1);

            for (int $$4 = $$3; $$4 >= 0 && $$4 < this.aI_().size(); $$4 += $$2) {
               fnt $$5 = this.aI_().get($$4);
               flg $$6 = $$5.a($$0);
               if ($$6 != null) {
                  return flg.a(this, $$6);
               }
            }
         }

         return fns.super.a($$0);
      }

      public abstract List<? extends fps> b();

      void a(fpu $$0) {
         List<? extends fps> $$1 = this.b();
         frp.b $$2 = frp.a($$1, this.b);
         if ($$2 != null) {
            if ($$2.c.a()) {
               this.b = $$2.a;
            }

            if ($$1.size() > 1) {
               $$0.a(fpt.b, xl.a("narrator.position.object_list", $$2.b + 1, $$1.size()));
               if ($$2.c == fps.a.c) {
                  $$0.a(fpt.d, xl.c("narration.component_list.usage"));
               }
            }

            $$2.a.b($$0.a());
         }
      }
   }
}
