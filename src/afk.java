import javax.annotation.Nullable;

public class afk implements zb<abn> {
   public static final ys<vr, afk> a = zb.a(afk::a, afk::new);
   private static final int b = 1;
   private static final int c = 2;
   @Nullable
   private final akk d;
   @Nullable
   private final avi e;

   public afk(@Nullable akk $$0, @Nullable avi $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   private afk(vr $$0) {
      int $$1 = $$0.readByte();
      if (($$1 & 1) > 0) {
         this.e = $$0.b(avi.class);
      } else {
         this.e = null;
      }

      if (($$1 & 2) > 0) {
         this.d = $$0.q();
      } else {
         this.d = null;
      }
   }

   private void a(vr $$0) {
      if (this.e != null) {
         if (this.d != null) {
            $$0.k(3);
            $$0.a(this.e);
            $$0.a(this.d);
         } else {
            $$0.k(1);
            $$0.a(this.e);
         }
      } else if (this.d != null) {
         $$0.k(2);
         $$0.a(this.d);
      } else {
         $$0.k(0);
      }
   }

   @Override
   public zd<afk> a() {
      return afz.aU;
   }

   public void a(abn $$0) {
      $$0.a(this);
   }

   @Nullable
   public akk b() {
      return this.d;
   }

   @Nullable
   public avi e() {
      return this.e;
   }
}
