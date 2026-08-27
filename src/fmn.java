import com.mojang.authlib.minecraft.report.AbuseReport;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.datafixers.util.Either;
import java.time.Instant;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class fmn {
   protected final UUID a;
   protected final Instant b;
   protected final UUID c;
   protected String d = "";
   @Nullable
   protected fmp e;

   public fmn(UUID $$0, Instant $$1, UUID $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(UUID $$0) {
      return $$0.equals(this.c);
   }

   public abstract fmn b();

   public abstract faz a(faz var1, fmr var2);

   public abstract static class a<R extends fmn> {
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
      public fmp h() {
         return this.a.e;
      }

      public void a(fmp $$0) {
         this.a.e = $$0;
      }

      public abstract boolean b();

      @Nullable
      public abstract fmn.b c();

      public abstract Either<fmn.c, fmn.b> a(fmr var1);
   }

   public static record b(uv e) {
      public static final fmn.b a = new fmn.b(uv.c("gui.abuseReport.send.no_reason"));
      public static final fmn.b b = new fmn.b(uv.c("gui.chatReport.send.no_reported_messages"));
      public static final fmn.b c = new fmn.b(uv.c("gui.chatReport.send.too_many_messages"));
      public static final fmn.b d = new fmn.b(uv.c("gui.abuseReport.send.comment_too_long"));

      public ewp a() {
         return ewp.a(this.e);
      }

      public uv b() {
         return this.e;
      }
   }

   public static record c(UUID a, fmq b, AbuseReport c) {
   }
}
