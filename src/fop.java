import com.mojang.authlib.minecraft.report.AbuseReport;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.datafixers.util.Either;
import java.time.Instant;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class fop {
   protected final UUID a;
   protected final Instant b;
   protected final UUID c;
   protected String d = "";
   @Nullable
   protected fos e;

   public fop(UUID $$0, Instant $$1, UUID $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(UUID $$0) {
      return $$0.equals(this.c);
   }

   public abstract fop b();

   public abstract fcz a(fcz var1, fou var2);

   public abstract static class a<R extends fop> {
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
      public fos h() {
         return this.a.e;
      }

      public void a(fos $$0) {
         this.a.e = $$0;
      }

      public abstract boolean b();

      @Nullable
      public abstract fop.b c();

      public abstract Either<fop.c, fop.b> a(fou var1);
   }

   public static record b(vf e) {
      public static final fop.b a = new fop.b(vf.c("gui.abuseReport.send.no_reason"));
      public static final fop.b b = new fop.b(vf.c("gui.chatReport.send.no_reported_messages"));
      public static final fop.b c = new fop.b(vf.c("gui.chatReport.send.too_many_messages"));
      public static final fop.b d = new fop.b(vf.c("gui.abuseReport.send.comment_too_long"));

      public eyp a() {
         return eyp.a(this.e);
      }

      public vf b() {
         return this.e;
      }
   }

   public static record c(UUID a, fot b, AbuseReport c) {
   }
}
