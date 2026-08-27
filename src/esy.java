import java.util.List;
import javax.annotation.Nullable;

public abstract class esy<E extends esy.a<E>> extends esn<E> {
   public esy(eqx $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public ese a(ewq $$0) {
      if (this.k() == 0) {
         return null;
      } else if (!($$0 instanceof ewq.a $$1)) {
         return super.a($$0);
      } else {
         E $$2 = this.h();
         if ($$1.b().a() == ewr.a && $$2 != null) {
            return ese.a(this, $$2.a($$0));
         } else {
            int $$3 = -1;
            ews $$4 = $$1.b();
            if ($$2 != null) {
               $$3 = $$2.i().indexOf($$2.t());
            }

            if ($$3 == -1) {
               switch ($$4) {
                  case c:
                     $$3 = Integer.MAX_VALUE;
                     $$4 = ews.b;
                     break;
                  case d:
                     $$3 = 0;
                     $$4 = ews.b;
                     break;
                  default:
                     $$3 = 0;
               }
            }

            E $$5 = $$2;

            ese $$6;
            do {
               $$5 = this.a($$4, $$0x -> !$$0x.i().isEmpty(), $$5);
               if ($$5 == null) {
                  return null;
               }

               $$6 = $$5.a($$1, $$3);
            } while ($$6 == null);

            return ese.a(this, $$6);
         }
      }
   }

   @Override
   public void a(@Nullable eum $$0) {
      super.a($$0);
      if ($$0 == null) {
         this.a(null);
      }
   }

   @Override
   public ewi.a q() {
      return this.aC_() ? ewi.a.c : super.q();
   }

   @Override
   protected boolean e(int $$0) {
      return false;
   }

   @Override
   public void b(ewk $$0) {
      E $$1 = this.r();
      if ($$1 != null) {
         $$1.a($$0.a());
         this.a($$0, $$1);
      } else {
         E $$2 = this.h();
         if ($$2 != null) {
            $$2.a($$0.a());
            this.a($$0, $$2);
         }
      }

      $$0.a(ewj.d, tn.c("narration.component_list.usage"));
   }

   public abstract static class a<E extends esy.a<E>> extends esn.a<E> implements eul {
      @Nullable
      private eum a;
      @Nullable
      private ewi b;
      private boolean c;

      @Override
      public boolean aB_() {
         return this.c;
      }

      @Override
      public void b(boolean $$0) {
         this.c = $$0;
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         return eul.super.a($$0, $$1, $$2);
      }

      @Override
      public void a(@Nullable eum $$0) {
         if (this.a != null) {
            this.a.b_(false);
         }

         if ($$0 != null) {
            $$0.b_(true);
         }

         this.a = $$0;
      }

      @Nullable
      @Override
      public eum t() {
         return this.a;
      }

      @Nullable
      public ese a(ewq $$0, int $$1) {
         if (this.i().isEmpty()) {
            return null;
         } else {
            ese $$2 = this.i().get(Math.min($$1, this.i().size() - 1)).a($$0);
            return ese.a(this, $$2);
         }
      }

      @Nullable
      @Override
      public ese a(ewq $$0) {
         if ($$0 instanceof ewq.a $$1) {
            int $$2 = switch ($$1.b()) {
               case c -> -1;
               case d -> 1;
               case a, b -> 0;
            };
            if ($$2 == 0) {
               return null;
            }

            int $$3 = ary.a($$2 + this.i().indexOf(this.t()), 0, this.i().size() - 1);

            for (int $$4 = $$3; $$4 >= 0 && $$4 < this.i().size(); $$4 += $$2) {
               eum $$5 = this.i().get($$4);
               ese $$6 = $$5.a($$0);
               if ($$6 != null) {
                  return ese.a(this, $$6);
               }
            }
         }

         return eul.super.a($$0);
      }

      public abstract List<? extends ewi> b();

      void a(ewk $$0) {
         List<? extends ewi> $$1 = this.b();
         eym.b $$2 = eym.a($$1, this.b);
         if ($$2 != null) {
            if ($$2.c.a()) {
               this.b = $$2.a;
            }

            if ($$1.size() > 1) {
               $$0.a(ewj.b, tn.a("narrator.position.object_list", $$2.b + 1, $$1.size()));
               if ($$2.c == ewi.a.c) {
                  $$0.a(ewj.d, tn.c("narration.component_list.usage"));
               }
            }

            $$2.a.b($$0.a());
         }
      }
   }
}
