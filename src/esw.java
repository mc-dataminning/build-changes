import java.util.List;
import javax.annotation.Nullable;

public abstract class esw<E extends esw.a<E>> extends esl<E> {
   public esw(eqv $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public esc a(ewo $$0) {
      if (this.k() == 0) {
         return null;
      } else if (!($$0 instanceof ewo.a $$1)) {
         return super.a($$0);
      } else {
         E $$2 = this.h();
         if ($$1.b().a() == ewp.a && $$2 != null) {
            return esc.a(this, $$2.a($$0));
         } else {
            int $$3 = -1;
            ewq $$4 = $$1.b();
            if ($$2 != null) {
               $$3 = $$2.i().indexOf($$2.t());
            }

            if ($$3 == -1) {
               switch ($$4) {
                  case c:
                     $$3 = Integer.MAX_VALUE;
                     $$4 = ewq.b;
                     break;
                  case d:
                     $$3 = 0;
                     $$4 = ewq.b;
                     break;
                  default:
                     $$3 = 0;
               }
            }

            E $$5 = $$2;

            esc $$6;
            do {
               $$5 = this.a($$4, $$0x -> !$$0x.i().isEmpty(), $$5);
               if ($$5 == null) {
                  return null;
               }

               $$6 = $$5.a($$1, $$3);
            } while ($$6 == null);

            return esc.a(this, $$6);
         }
      }
   }

   @Override
   public void a(@Nullable euk $$0) {
      super.a($$0);
      if ($$0 == null) {
         this.a(null);
      }
   }

   @Override
   public ewg.a q() {
      return this.aD_() ? ewg.a.c : super.q();
   }

   @Override
   protected boolean e(int $$0) {
      return false;
   }

   @Override
   public void b(ewi $$0) {
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

      $$0.a(ewh.d, tm.c("narration.component_list.usage"));
   }

   public abstract static class a<E extends esw.a<E>> extends esl.a<E> implements euj {
      @Nullable
      private euk a;
      @Nullable
      private ewg b;
      private boolean c;

      @Override
      public boolean aC_() {
         return this.c;
      }

      @Override
      public void b(boolean $$0) {
         this.c = $$0;
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         return euj.super.a($$0, $$1, $$2);
      }

      @Override
      public void a(@Nullable euk $$0) {
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
      public euk t() {
         return this.a;
      }

      @Nullable
      public esc a(ewo $$0, int $$1) {
         if (this.i().isEmpty()) {
            return null;
         } else {
            esc $$2 = this.i().get(Math.min($$1, this.i().size() - 1)).a($$0);
            return esc.a(this, $$2);
         }
      }

      @Nullable
      @Override
      public esc a(ewo $$0) {
         if ($$0 instanceof ewo.a $$1) {
            int $$2 = switch ($$1.b()) {
               case c -> -1;
               case d -> 1;
               case a, b -> 0;
            };
            if ($$2 == 0) {
               return null;
            }

            int $$3 = arx.a($$2 + this.i().indexOf(this.t()), 0, this.i().size() - 1);

            for (int $$4 = $$3; $$4 >= 0 && $$4 < this.i().size(); $$4 += $$2) {
               euk $$5 = this.i().get($$4);
               esc $$6 = $$5.a($$0);
               if ($$6 != null) {
                  return esc.a(this, $$6);
               }
            }
         }

         return euj.super.a($$0);
      }

      public abstract List<? extends ewg> b();

      void a(ewi $$0) {
         List<? extends ewg> $$1 = this.b();
         eyk.b $$2 = eyk.a($$1, this.b);
         if ($$2 != null) {
            if ($$2.c.a()) {
               this.b = $$2.a;
            }

            if ($$1.size() > 1) {
               $$0.a(ewh.b, tm.a("narrator.position.object_list", $$2.b + 1, $$1.size()));
               if ($$2.c == ewg.a.c) {
                  $$0.a(ewh.d, tm.c("narration.component_list.usage"));
               }
            }

            $$2.a.b($$0.a());
         }
      }
   }
}
