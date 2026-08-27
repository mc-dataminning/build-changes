import com.mojang.authlib.minecraft.report.AbuseReport;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.datafixers.util.Either;
import java.time.Instant;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class ftc {
   protected final UUID a;
   protected final Instant b;
   protected final UUID c;
   protected String d = "";
   @Nullable
   protected fte e;

   public ftc(UUID $$0, Instant $$1, UUID $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(UUID $$0) {
      return $$0.equals(this.c);
   }

   public abstract ftc b();

   public abstract fhf a(fhf var1, ftg var2);

   public abstract static class a<R extends ftc> {
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
      public fte h() {
         return this.a.e;
      }

      public void a(fte $$0) {
         this.a.e = $$0;
      }

      public abstract boolean b();

      @Nullable
      public abstract ftc.b c();

      public abstract Either<ftc.c, ftc.b> a(ftg var1);
   }

   public static record b(vu e) {
      public static final ftc.b a = new ftc.b(vu.c("gui.abuseReport.send.no_reason"));
      public static final ftc.b b = new ftc.b(vu.c("gui.chatReport.send.no_reported_messages"));
      public static final ftc.b c = new ftc.b(vu.c("gui.chatReport.send.too_many_messages"));
      public static final ftc.b d = new ftc.b(vu.c("gui.abuseReport.send.comment_too_long"));

      public fcr a() {
         return fcr.a(this.e);
      }

      public vu b() {
         return this.e;
      }
   }

   public static record c(UUID a, ftf b, AbuseReport c) {
   }
}
