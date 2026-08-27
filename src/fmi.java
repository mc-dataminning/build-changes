import com.mojang.authlib.minecraft.report.AbuseReport;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.datafixers.util.Either;
import java.time.Instant;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class fmi {
   protected final UUID a;
   protected final Instant b;
   protected final UUID c;
   protected String d = "";
   @Nullable
   protected fmk e;

   public fmi(UUID $$0, Instant $$1, UUID $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(UUID $$0) {
      return $$0.equals(this.c);
   }

   public abstract fmi b();

   public abstract fau a(fau var1, fmm var2);

   public abstract static class a<R extends fmi> {
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
      public fmk h() {
         return this.a.e;
      }

      public void a(fmk $$0) {
         this.a.e = $$0;
      }

      public abstract boolean b();

      @Nullable
      public abstract fmi.b c();

      public abstract Either<fmi.c, fmi.b> a(fmm var1);
   }

   public static record b(ur e) {
      public static final fmi.b a = new fmi.b(ur.c("gui.abuseReport.send.no_reason"));
      public static final fmi.b b = new fmi.b(ur.c("gui.chatReport.send.no_reported_messages"));
      public static final fmi.b c = new fmi.b(ur.c("gui.chatReport.send.too_many_messages"));
      public static final fmi.b d = new fmi.b(ur.c("gui.abuseReport.send.comment_too_long"));

      public ewk a() {
         return ewk.a(this.e);
      }

      public ur b() {
         return this.e;
      }
   }

   public static record c(UUID a, fml b, AbuseReport c) {
   }
}
