import com.mojang.authlib.minecraft.report.AbuseReport;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.datafixers.util.Either;
import java.time.Instant;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class flv {
   protected final UUID a;
   protected final Instant b;
   protected final UUID c;
   protected String d = "";
   @Nullable
   protected flx e;

   public flv(UUID $$0, Instant $$1, UUID $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(UUID $$0) {
      return $$0.equals(this.c);
   }

   public abstract flv b();

   public abstract fah a(fah var1, flz var2);

   public abstract static class a<R extends flv> {
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
      public flx h() {
         return this.a.e;
      }

      public void a(flx $$0) {
         this.a.e = $$0;
      }

      public abstract boolean b();

      @Nullable
      public abstract flv.b c();

      public abstract Either<flv.c, flv.b> a(flz var1);
   }

   public static record b(ur e) {
      public static final flv.b a = new flv.b(ur.c("gui.abuseReport.send.no_reason"));
      public static final flv.b b = new flv.b(ur.c("gui.chatReport.send.no_reported_messages"));
      public static final flv.b c = new flv.b(ur.c("gui.chatReport.send.too_many_messages"));
      public static final flv.b d = new flv.b(ur.c("gui.abuseReport.send.comment_too_long"));

      public evx a() {
         return evx.a(this.e);
      }

      public ur b() {
         return this.e;
      }
   }

   public static record c(UUID a, fly b, AbuseReport c) {
   }
}
