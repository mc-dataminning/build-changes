import java.util.List;
import javax.annotation.Nullable;

public abstract class esn<E extends esn.a<E>> extends esc<E> {
   public esn(eqm $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public ert a(ewd $$0) {
      if (this.k() == 0) {
         return null;
      } else if (!($$0 instanceof ewd.a $$1)) {
         return super.a($$0);
      } else {
         E $$2 = this.h();
         if ($$1.b().a() == ewe.a && $$2 != null) {
            return ert.a(this, $$2.a($$0));
         } else {
            int $$3 = -1;
            ewf $$4 = $$1.b();
            if ($$2 != null) {
               $$3 = $$2.i().indexOf($$2.t());
            }

            if ($$3 == -1) {
               switch ($$4) {
                  case c:
                     $$3 = Integer.MAX_VALUE;
                     $$4 = ewf.b;
                     break;
                  case d:
                     $$3 = 0;
                     $$4 = ewf.b;
                     break;
                  default:
                     $$3 = 0;
               }
            }

            E $$5 = $$2;

            ert $$6;
            do {
               $$5 = this.a($$4, $$0x -> !$$0x.i().isEmpty(), $$5);
               if ($$5 == null) {
                  return null;
               }

               $$6 = $$5.a($$1, $$3);
            } while ($$6 == null);

            return ert.a(this, $$6);
         }
      }
   }

   @Override
   public void a(@Nullable eua $$0) {
      super.a($$0);
      if ($$0 == null) {
         this.a(null);
      }
   }

   @Override
   public evv.a q() {
      return this.ax_() ? evv.a.c : super.q();
   }

   @Override
   protected boolean e(int $$0) {
      return false;
   }

   @Override
   public void b(evx $$0) {
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

      $$0.a(evw.d, tf.c("narration.component_list.usage"));
   }

   public abstract static class a<E extends esn.a<E>> extends esc.a<E> implements etz {
      @Nullable
      private eua a;
      @Nullable
      private evv b;
      private boolean c;

      @Override
      public boolean aw_() {
         return this.c;
      }

      @Override
      public void b_(boolean $$0) {
         this.c = $$0;
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         return etz.super.a($$0, $$1, $$2);
      }

      @Override
      public void a(@Nullable eua $$0) {
         if (this.a != null) {
            this.a.c_(false);
         }

         if ($$0 != null) {
            $$0.c_(true);
         }

         this.a = $$0;
      }

      @Nullable
      @Override
      public eua t() {
         return this.a;
      }

      @Nullable
      public ert a(ewd $$0, int $$1) {
         if (this.i().isEmpty()) {
            return null;
         } else {
            ert $$2 = this.i().get(Math.min($$1, this.i().size() - 1)).a($$0);
            return ert.a(this, $$2);
         }
      }

      @Nullable
      @Override
      public ert a(ewd $$0) {
         if ($$0 instanceof ewd.a $$1) {
            int $$2 = switch ($$1.b()) {
               case c -> -1;
               case d -> 1;
               case a, b -> 0;
            };
            if ($$2 == 0) {
               return null;
            }

            int $$3 = arp.a($$2 + this.i().indexOf(this.t()), 0, this.i().size() - 1);

            for (int $$4 = $$3; $$4 >= 0 && $$4 < this.i().size(); $$4 += $$2) {
               eua $$5 = this.i().get($$4);
               ert $$6 = $$5.a($$0);
               if ($$6 != null) {
                  return ert.a(this, $$6);
               }
            }
         }

         return etz.super.a($$0);
      }

      public abstract List<? extends evv> b();

      void a(evx $$0) {
         List<? extends evv> $$1 = this.b();
         exz.b $$2 = exz.a($$1, this.b);
         if ($$2 != null) {
            if ($$2.c.a()) {
               this.b = $$2.a;
            }

            if ($$1.size() > 1) {
               $$0.a(evw.b, tf.a("narrator.position.object_list", $$2.b + 1, $$1.size()));
               if ($$2.c == evv.a.c) {
                  $$0.a(evw.d, tf.c("narration.component_list.usage"));
               }
            }

            $$2.a.b($$0.a());
         }
      }
   }
}
