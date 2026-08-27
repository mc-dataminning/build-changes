import java.util.Objects;
import javax.annotation.Nullable;

public class eov {
   private final epd a;
   private final String b;
   private final epg c;
   private vq d;
   private vq e;
   private epg.a f;
   private boolean g;
   @Nullable
   private xg h;

   public eov(epd $$0, String $$1, epg $$2, vq $$3, epg.a $$4, boolean $$5, @Nullable xg $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = this.i();
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
   }

   public epd a() {
      return this.a;
   }

   public String b() {
      return this.b;
   }

   public epg c() {
      return this.c;
   }

   public vq d() {
      return this.d;
   }

   public boolean e() {
      return this.g;
   }

   @Nullable
   public xg f() {
      return this.h;
   }

   public xg a(xg $$0) {
      return Objects.requireNonNullElse(this.h, $$0);
   }

   private vq i() {
      return vt.a((vq)this.d.f().a($$0 -> $$0.a(new vw(vw.a.a, vq.b(this.b)))));
   }

   public vq g() {
      return this.e;
   }

   public void a(vq $$0) {
      this.d = $$0;
      this.e = this.i();
      this.a.b(this);
   }

   public epg.a h() {
      return this.f;
   }

   public void a(epg.a $$0) {
      this.f = $$0;
      this.a.b(this);
   }

   public void a(boolean $$0) {
      this.g = $$0;
      this.a.b(this);
   }

   public void b(@Nullable xg $$0) {
      this.h = $$0;
      this.a.b(this);
   }
}
