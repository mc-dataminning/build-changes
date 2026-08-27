import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Objects;

public class cab {
   private final ib a;
   private final il<cad> b;
   private int c;
   private final Runnable d;

   public static Codec<cab> a(Runnable $$0) {
      return RecordCodecBuilder.create(
         $$1 -> $$1.group(
                  ib.a.fieldOf("pos").forGetter($$0xx -> $$0xx.a),
                  aiz.a(ki.U).fieldOf("type").forGetter($$0xx -> $$0xx.b),
                  Codec.INT.fieldOf("free_tickets").orElse(0).forGetter($$0xx -> $$0xx.c),
                  RecordCodecBuilder.point($$0)
               )
               .apply($$1, cab::new)
      );
   }

   private cab(ib $$0, il<cad> $$1, int $$2, Runnable $$3) {
      this.a = $$0.i();
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public cab(ib $$0, il<cad> $$1, Runnable $$2) {
      this($$0, $$1, $$1.a().b(), $$2);
   }

   @Deprecated
   @axp
   public int a() {
      return this.c;
   }

   protected boolean b() {
      if (this.c <= 0) {
         return false;
      } else {
         this.c--;
         this.d.run();
         return true;
      }
   }

   protected boolean c() {
      if (this.c >= this.b.a().b()) {
         return false;
      } else {
         this.c++;
         this.d.run();
         return true;
      }
   }

   public boolean d() {
      return this.c > 0;
   }

   public boolean e() {
      return this.c != this.b.a().b();
   }

   public ib f() {
      return this.a;
   }

   public il<cad> g() {
      return this.b;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? Objects.equals(this.a, ((cab)$$0).a) : false;
      }
   }

   @Override
   public int hashCode() {
      return this.a.hashCode();
   }
}
