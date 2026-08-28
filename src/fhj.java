import java.util.List;
import javax.annotation.Nullable;

public abstract class fhj<E extends fhj.a<E>> extends fgy<E> {
   public fhj(ffe $$0, int $$1, int $$2, int $$3, int $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   @Override
   public fgn a(flf $$0) {
      if (this.l() == 0) {
         return null;
      } else if (!($$0 instanceof flf.a $$1)) {
         return super.a($$0);
      } else {
         E $$2 = this.j();
         if ($$1.b().a() == flg.a && $$2 != null) {
            return fgn.a(this, $$2.a($$0));
         } else {
            int $$3 = -1;
            flh $$4 = $$1.b();
            if ($$2 != null) {
               $$3 = $$2.aD_().indexOf($$2.aG_());
            }

            if ($$3 == -1) {
               switch ($$4) {
                  case c:
                     $$3 = Integer.MAX_VALUE;
                     $$4 = flh.b;
                     break;
                  case d:
                     $$3 = 0;
                     $$4 = flh.b;
                     break;
                  default:
                     $$3 = 0;
               }
            }

            E $$5 = $$2;

            fgn $$6;
            do {
               $$5 = this.a($$4, $$0x -> !$$0x.aD_().isEmpty(), $$5);
               if ($$5 == null) {
                  return null;
               }

               $$6 = $$5.a($$1, $$3);
            } while ($$6 == null);

            return fgn.a(this, $$6);
         }
      }
   }

   @Override
   public void a(@Nullable fiz $$0) {
      super.a($$0);
      if ($$0 == null) {
         this.a(null);
      }
   }

   @Override
   public fkx.a t() {
      return this.aH_() ? fkx.a.c : super.t();
   }

   @Override
   protected boolean e(int $$0) {
      return false;
   }

   @Override
   public void a(fkz $$0) {
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

      $$0.a(fky.d, xo.c("narration.component_list.usage"));
   }

   public abstract static class a<E extends fhj.a<E>> extends fgy.a<E> implements fiy {
      @Nullable
      private fiz a;
      @Nullable
      private fkx b;
      private boolean c;

      @Override
      public boolean aF_() {
         return this.c;
      }

      @Override
      public void b(boolean $$0) {
         this.c = $$0;
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         return fiy.super.a($$0, $$1, $$2);
      }

      @Override
      public void a(@Nullable fiz $$0) {
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
      public fiz aG_() {
         return this.a;
      }

      @Nullable
      public fgn a(flf $$0, int $$1) {
         if (this.aD_().isEmpty()) {
            return null;
         } else {
            fgn $$2 = this.aD_().get(Math.min($$1, this.aD_().size() - 1)).a($$0);
            return fgn.a(this, $$2);
         }
      }

      @Nullable
      @Override
      public fgn a(flf $$0) {
         if ($$0 instanceof flf.a $$1) {
            int $$2 = switch ($$1.b()) {
               case c -> -1;
               case d -> 1;
               case a, b -> 0;
            };
            if ($$2 == 0) {
               return null;
            }

            int $$3 = ayy.a($$2 + this.aD_().indexOf(this.aG_()), 0, this.aD_().size() - 1);

            for (int $$4 = $$3; $$4 >= 0 && $$4 < this.aD_().size(); $$4 += $$2) {
               fiz $$5 = this.aD_().get($$4);
               fgn $$6 = $$5.a($$0);
               if ($$6 != null) {
                  return fgn.a(this, $$6);
               }
            }
         }

         return fiy.super.a($$0);
      }

      public abstract List<? extends fkx> b();

      void a(fkz $$0) {
         List<? extends fkx> $$1 = this.b();
         fnc.b $$2 = fnc.a($$1, this.b);
         if ($$2 != null) {
            if ($$2.c.a()) {
               this.b = $$2.a;
            }

            if ($$1.size() > 1) {
               $$0.a(fky.b, xo.a("narrator.position.object_list", $$2.b + 1, $$1.size()));
               if ($$2.c == fkx.a.c) {
                  $$0.a(fky.d, xo.c("narration.component_list.usage"));
               }
            }

            $$2.a.b($$0.a());
         }
      }
   }
}
