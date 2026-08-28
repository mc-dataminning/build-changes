import java.util.List;
import javax.annotation.Nullable;

public abstract class fku<E extends fku.a<E>> extends fkj<E> {
   public fku(fip $$0, int $$1, int $$2, int $$3, int $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   @Override
   public fjy a(fos $$0) {
      if (this.l() == 0) {
         return null;
      } else if (!($$0 instanceof fos.a $$1)) {
         return super.a($$0);
      } else {
         E $$2 = this.j();
         if ($$1.b().a() == fot.a && $$2 != null) {
            return fjy.a(this, $$2.a($$0));
         } else {
            int $$3 = -1;
            fou $$4 = $$1.b();
            if ($$2 != null) {
               $$3 = $$2.aJ_().indexOf($$2.aM_());
            }

            if ($$3 == -1) {
               switch ($$4) {
                  case c:
                     $$3 = Integer.MAX_VALUE;
                     $$4 = fou.b;
                     break;
                  case d:
                     $$3 = 0;
                     $$4 = fou.b;
                     break;
                  default:
                     $$3 = 0;
               }
            }

            E $$5 = $$2;

            fjy $$6;
            do {
               $$5 = this.a($$4, $$0x -> !$$0x.aJ_().isEmpty(), $$5);
               if ($$5 == null) {
                  return null;
               }

               $$6 = $$5.a($$1, $$3);
            } while ($$6 == null);

            return fjy.a(this, $$6);
         }
      }
   }

   @Override
   public void a(@Nullable fml $$0) {
      if (this.j() != $$0) {
         super.a($$0);
         if ($$0 == null) {
            this.a(null);
         }
      }
   }

   @Override
   public foj.a u() {
      return this.aN_() ? foj.a.c : super.u();
   }

   @Override
   protected boolean e(int $$0) {
      return false;
   }

   @Override
   public void a(fol $$0) {
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

      $$0.a(fok.d, xe.c("narration.component_list.usage"));
   }

   public abstract static class a<E extends fku.a<E>> extends fkj.a<E> implements fmk {
      @Nullable
      private fml a;
      @Nullable
      private foj b;
      private boolean c;

      @Override
      public boolean aL_() {
         return this.c;
      }

      @Override
      public void b_(boolean $$0) {
         this.c = $$0;
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         return fmk.super.a($$0, $$1, $$2);
      }

      @Override
      public void a(@Nullable fml $$0) {
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
      public fml aM_() {
         return this.a;
      }

      @Nullable
      public fjy a(fos $$0, int $$1) {
         if (this.aJ_().isEmpty()) {
            return null;
         } else {
            fjy $$2 = this.aJ_().get(Math.min($$1, this.aJ_().size() - 1)).a($$0);
            return fjy.a(this, $$2);
         }
      }

      @Nullable
      @Override
      public fjy a(fos $$0) {
         if ($$0 instanceof fos.a $$1) {
            int $$2 = switch ($$1.b()) {
               case c -> -1;
               case d -> 1;
               case a, b -> 0;
            };
            if ($$2 == 0) {
               return null;
            }

            int $$3 = azf.a($$2 + this.aJ_().indexOf(this.aM_()), 0, this.aJ_().size() - 1);

            for (int $$4 = $$3; $$4 >= 0 && $$4 < this.aJ_().size(); $$4 += $$2) {
               fml $$5 = this.aJ_().get($$4);
               fjy $$6 = $$5.a($$0);
               if ($$6 != null) {
                  return fjy.a(this, $$6);
               }
            }
         }

         return fmk.super.a($$0);
      }

      public abstract List<? extends foj> b();

      void a(fol $$0) {
         List<? extends foj> $$1 = this.b();
         fqh.b $$2 = fqh.a($$1, this.b);
         if ($$2 != null) {
            if ($$2.c.a()) {
               this.b = $$2.a;
            }

            if ($$1.size() > 1) {
               $$0.a(fok.b, xe.a("narrator.position.object_list", $$2.b + 1, $$1.size()));
               if ($$2.c == foj.a.c) {
                  $$0.a(fok.d, xe.c("narration.component_list.usage"));
               }
            }

            $$2.a.b($$0.a());
         }
      }
   }
}
