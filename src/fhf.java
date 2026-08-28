import java.util.List;
import javax.annotation.Nullable;

public abstract class fhf<E extends fhf.a<E>> extends fgu<E> {
   public fhf(ffa $$0, int $$1, int $$2, int $$3, int $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   @Override
   public fgj a(flb $$0) {
      if (this.l() == 0) {
         return null;
      } else if (!($$0 instanceof flb.a $$1)) {
         return super.a($$0);
      } else {
         E $$2 = this.j();
         if ($$1.b().a() == flc.a && $$2 != null) {
            return fgj.a(this, $$2.a($$0));
         } else {
            int $$3 = -1;
            fld $$4 = $$1.b();
            if ($$2 != null) {
               $$3 = $$2.aF_().indexOf($$2.aI_());
            }

            if ($$3 == -1) {
               switch ($$4) {
                  case c:
                     $$3 = Integer.MAX_VALUE;
                     $$4 = fld.b;
                     break;
                  case d:
                     $$3 = 0;
                     $$4 = fld.b;
                     break;
                  default:
                     $$3 = 0;
               }
            }

            E $$5 = $$2;

            fgj $$6;
            do {
               $$5 = this.a($$4, $$0x -> !$$0x.aF_().isEmpty(), $$5);
               if ($$5 == null) {
                  return null;
               }

               $$6 = $$5.a($$1, $$3);
            } while ($$6 == null);

            return fgj.a(this, $$6);
         }
      }
   }

   @Override
   public void a(@Nullable fiv $$0) {
      super.a($$0);
      if ($$0 == null) {
         this.a(null);
      }
   }

   @Override
   public fkt.a t() {
      return this.aJ_() ? fkt.a.c : super.t();
   }

   @Override
   protected boolean e(int $$0) {
      return false;
   }

   @Override
   public void a(fkv $$0) {
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

      $$0.a(fku.d, xl.c("narration.component_list.usage"));
   }

   public abstract static class a<E extends fhf.a<E>> extends fgu.a<E> implements fiu {
      @Nullable
      private fiv a;
      @Nullable
      private fkt b;
      private boolean c;

      @Override
      public boolean aH_() {
         return this.c;
      }

      @Override
      public void b(boolean $$0) {
         this.c = $$0;
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         return fiu.super.a($$0, $$1, $$2);
      }

      @Override
      public void a(@Nullable fiv $$0) {
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
      public fiv aI_() {
         return this.a;
      }

      @Nullable
      public fgj a(flb $$0, int $$1) {
         if (this.aF_().isEmpty()) {
            return null;
         } else {
            fgj $$2 = this.aF_().get(Math.min($$1, this.aF_().size() - 1)).a($$0);
            return fgj.a(this, $$2);
         }
      }

      @Nullable
      @Override
      public fgj a(flb $$0) {
         if ($$0 instanceof flb.a $$1) {
            int $$2 = switch ($$1.b()) {
               case c -> -1;
               case d -> 1;
               case a, b -> 0;
            };
            if ($$2 == 0) {
               return null;
            }

            int $$3 = ayu.a($$2 + this.aF_().indexOf(this.aI_()), 0, this.aF_().size() - 1);

            for (int $$4 = $$3; $$4 >= 0 && $$4 < this.aF_().size(); $$4 += $$2) {
               fiv $$5 = this.aF_().get($$4);
               fgj $$6 = $$5.a($$0);
               if ($$6 != null) {
                  return fgj.a(this, $$6);
               }
            }
         }

         return fiu.super.a($$0);
      }

      public abstract List<? extends fkt> b();

      void a(fkv $$0) {
         List<? extends fkt> $$1 = this.b();
         fmy.b $$2 = fmy.a($$1, this.b);
         if ($$2 != null) {
            if ($$2.c.a()) {
               this.b = $$2.a;
            }

            if ($$1.size() > 1) {
               $$0.a(fku.b, xl.a("narrator.position.object_list", $$2.b + 1, $$1.size()));
               if ($$2.c == fkt.a.c) {
                  $$0.a(fku.d, xl.c("narration.component_list.usage"));
               }
            }

            $$2.a.b($$0.a());
         }
      }
   }
}
