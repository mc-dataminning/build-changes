import java.util.List;
import javax.annotation.Nullable;

public abstract class exe<E extends exe.a<E>> extends ewt<E> {
   public exe(eva $$0, int $$1, int $$2, int $$3, int $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   @Override
   public ewj a(fax $$0) {
      if (this.n() == 0) {
         return null;
      } else if (!($$0 instanceof fax.a $$1)) {
         return super.a($$0);
      } else {
         E $$2 = this.k();
         if ($$1.b().a() == fay.a && $$2 != null) {
            return ewj.a(this, $$2.a($$0));
         } else {
            int $$3 = -1;
            faz $$4 = $$1.b();
            if ($$2 != null) {
               $$3 = $$2.l().indexOf($$2.aH_());
            }

            if ($$3 == -1) {
               switch ($$4) {
                  case c:
                     $$3 = Integer.MAX_VALUE;
                     $$4 = faz.b;
                     break;
                  case d:
                     $$3 = 0;
                     $$4 = faz.b;
                     break;
                  default:
                     $$3 = 0;
               }
            }

            E $$5 = $$2;

            ewj $$6;
            do {
               $$5 = this.a($$4, $$0x -> !$$0x.l().isEmpty(), $$5);
               if ($$5 == null) {
                  return null;
               }

               $$6 = $$5.a($$1, $$3);
            } while ($$6 == null);

            return ewj.a(this, $$6);
         }
      }
   }

   @Override
   public void a(@Nullable eyt $$0) {
      super.a($$0);
      if ($$0 == null) {
         this.a(null);
      }
   }

   @Override
   public fap.a s() {
      return this.aI_() ? fap.a.c : super.s();
   }

   @Override
   protected boolean e(int $$0) {
      return false;
   }

   @Override
   public void a(far $$0) {
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

      $$0.a(faq.d, vd.c("narration.component_list.usage"));
   }

   public abstract static class a<E extends exe.a<E>> extends ewt.a<E> implements eys {
      @Nullable
      private eyt a;
      @Nullable
      private fap b;
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
         return eys.super.a($$0, $$1, $$2);
      }

      @Override
      public void a(@Nullable eyt $$0) {
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
      public eyt aH_() {
         return this.a;
      }

      @Nullable
      public ewj a(fax $$0, int $$1) {
         if (this.l().isEmpty()) {
            return null;
         } else {
            ewj $$2 = this.l().get(Math.min($$1, this.l().size() - 1)).a($$0);
            return ewj.a(this, $$2);
         }
      }

      @Nullable
      @Override
      public ewj a(fax $$0) {
         if ($$0 instanceof fax.a $$1) {
            int $$2 = switch ($$1.b()) {
               case c -> -1;
               case d -> 1;
               case a, b -> 0;
            };
            if ($$2 == 0) {
               return null;
            }

            int $$3 = aui.a($$2 + this.l().indexOf(this.aH_()), 0, this.l().size() - 1);

            for (int $$4 = $$3; $$4 >= 0 && $$4 < this.l().size(); $$4 += $$2) {
               eyt $$5 = this.l().get($$4);
               ewj $$6 = $$5.a($$0);
               if ($$6 != null) {
                  return ewj.a(this, $$6);
               }
            }
         }

         return eys.super.a($$0);
      }

      public abstract List<? extends fap> a();

      void a(far $$0) {
         List<? extends fap> $$1 = this.a();
         fct.b $$2 = fct.a($$1, this.b);
         if ($$2 != null) {
            if ($$2.c.a()) {
               this.b = $$2.a;
            }

            if ($$1.size() > 1) {
               $$0.a(faq.b, vd.a("narrator.position.object_list", $$2.b + 1, $$1.size()));
               if ($$2.c == fap.a.c) {
                  $$0.a(faq.d, vd.c("narration.component_list.usage"));
               }
            }

            $$2.a.b($$0.a());
         }
      }
   }
}
