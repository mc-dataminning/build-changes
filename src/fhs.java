import java.util.List;
import javax.annotation.Nullable;

public abstract class fhs<E extends fhs.a<E>> extends fhh<E> {
   public fhs(ffn $$0, int $$1, int $$2, int $$3, int $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   @Override
   public fgw a(flo $$0) {
      if (this.l() == 0) {
         return null;
      } else if (!($$0 instanceof flo.a $$1)) {
         return super.a($$0);
      } else {
         E $$2 = this.j();
         if ($$1.b().a() == flp.a && $$2 != null) {
            return fgw.a(this, $$2.a($$0));
         } else {
            int $$3 = -1;
            flq $$4 = $$1.b();
            if ($$2 != null) {
               $$3 = $$2.aF_().indexOf($$2.aI_());
            }

            if ($$3 == -1) {
               switch ($$4) {
                  case c:
                     $$3 = Integer.MAX_VALUE;
                     $$4 = flq.b;
                     break;
                  case d:
                     $$3 = 0;
                     $$4 = flq.b;
                     break;
                  default:
                     $$3 = 0;
               }
            }

            E $$5 = $$2;

            fgw $$6;
            do {
               $$5 = this.a($$4, $$0x -> !$$0x.aF_().isEmpty(), $$5);
               if ($$5 == null) {
                  return null;
               }

               $$6 = $$5.a($$1, $$3);
            } while ($$6 == null);

            return fgw.a(this, $$6);
         }
      }
   }

   @Override
   public void a(@Nullable fji $$0) {
      if (this.j() != $$0) {
         super.a($$0);
         if ($$0 == null) {
            this.a(null);
         }
      }
   }

   @Override
   public flg.a u() {
      return this.aJ_() ? flg.a.c : super.u();
   }

   @Override
   protected boolean e(int $$0) {
      return false;
   }

   @Override
   public void a(fli $$0) {
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

      $$0.a(flh.d, wu.c("narration.component_list.usage"));
   }

   public abstract static class a<E extends fhs.a<E>> extends fhh.a<E> implements fjh {
      @Nullable
      private fji a;
      @Nullable
      private flg b;
      private boolean c;

      @Override
      public boolean aH_() {
         return this.c;
      }

      @Override
      public void b_(boolean $$0) {
         this.c = $$0;
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         return fjh.super.a($$0, $$1, $$2);
      }

      @Override
      public void a(@Nullable fji $$0) {
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
      public fji aI_() {
         return this.a;
      }

      @Nullable
      public fgw a(flo $$0, int $$1) {
         if (this.aF_().isEmpty()) {
            return null;
         } else {
            fgw $$2 = this.aF_().get(Math.min($$1, this.aF_().size() - 1)).a($$0);
            return fgw.a(this, $$2);
         }
      }

      @Nullable
      @Override
      public fgw a(flo $$0) {
         if ($$0 instanceof flo.a $$1) {
            int $$2 = switch ($$1.b()) {
               case c -> -1;
               case d -> 1;
               case a, b -> 0;
            };
            if ($$2 == 0) {
               return null;
            }

            int $$3 = aye.a($$2 + this.aF_().indexOf(this.aI_()), 0, this.aF_().size() - 1);

            for (int $$4 = $$3; $$4 >= 0 && $$4 < this.aF_().size(); $$4 += $$2) {
               fji $$5 = this.aF_().get($$4);
               fgw $$6 = $$5.a($$0);
               if ($$6 != null) {
                  return fgw.a(this, $$6);
               }
            }
         }

         return fjh.super.a($$0);
      }

      public abstract List<? extends flg> b();

      void a(fli $$0) {
         List<? extends flg> $$1 = this.b();
         fnd.b $$2 = fnd.a($$1, this.b);
         if ($$2 != null) {
            if ($$2.c.a()) {
               this.b = $$2.a;
            }

            if ($$1.size() > 1) {
               $$0.a(flh.b, wu.a("narrator.position.object_list", $$2.b + 1, $$1.size()));
               if ($$2.c == flg.a.c) {
                  $$0.a(flh.d, wu.c("narration.component_list.usage"));
               }
            }

            $$2.a.b($$0.a());
         }
      }
   }
}
