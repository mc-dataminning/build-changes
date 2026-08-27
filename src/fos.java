import com.mojang.authlib.minecraft.report.AbuseReport;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.datafixers.util.Either;
import java.time.Instant;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class fos {
   protected final UUID a;
   protected final Instant b;
   protected final UUID c;
   protected String d = "";
   @Nullable
   protected fou e;

   public fos(UUID $$0, Instant $$1, UUID $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(UUID $$0) {
      return $$0.equals(this.c);
   }

   public abstract fos b();

   public abstract fdb a(fdb var1, fow var2);

   public abstract static class a<R extends fos> {
      protected final R a;
      protected final AbuseReportLimits b;

      protected a(R $$0, AbuseReportLimits $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public R e() {
         return this.a;
      }

      public UUID f() {
         return this.a.c;
      }

      public String g() {
         return this.a.d;
      }

      public void a(String $$0) {
         this.a.d = $$0;
      }

      @Nullable
      public fou h() {
         return this.a.e;
      }

      public void a(fou $$0) {
         this.a.e = $$0;
      }

      public abstract boolean b();

      @Nullable
      public abstract fos.b c();

      public abstract Either<fos.c, fos.b> a(fow var1);
   }

   public static record b(vf e) {
      public static final fos.b a = new fos.b(vf.c("gui.abuseReport.send.no_reason"));
      public static final fos.b b = new fos.b(vf.c("gui.chatReport.send.no_reported_messages"));
      public static final fos.b c = new fos.b(vf.c("gui.chatReport.send.too_many_messages"));
      public static final fos.b d = new fos.b(vf.c("gui.abuseReport.send.comment_too_long"));

      public eyr a() {
         return eyr.a(this.e);
      }

      public vf b() {
         return this.e;
      }
   }

   public static record c(UUID a, fov b, AbuseReport c) {
   }
}
