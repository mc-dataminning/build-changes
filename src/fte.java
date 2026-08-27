import com.mojang.authlib.minecraft.report.AbuseReport;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.datafixers.util.Either;
import java.time.Instant;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class fte {
   protected final UUID a;
   protected final Instant b;
   protected final UUID c;
   protected String d = "";
   @Nullable
   protected ftg e;

   public fte(UUID $$0, Instant $$1, UUID $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(UUID $$0) {
      return $$0.equals(this.c);
   }

   public abstract fte b();

   public abstract fhh a(fhh var1, fti var2);

   public abstract static class a<R extends fte> {
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
      public ftg h() {
         return this.a.e;
      }

      public void a(ftg $$0) {
         this.a.e = $$0;
      }

      public abstract boolean b();

      @Nullable
      public abstract fte.b c();

      public abstract Either<fte.c, fte.b> a(fti var1);
   }

   public static record b(vu e) {
      public static final fte.b a = new fte.b(vu.c("gui.abuseReport.send.no_reason"));
      public static final fte.b b = new fte.b(vu.c("gui.chatReport.send.no_reported_messages"));
      public static final fte.b c = new fte.b(vu.c("gui.chatReport.send.too_many_messages"));
      public static final fte.b d = new fte.b(vu.c("gui.abuseReport.send.comment_too_long"));

      public fct a() {
         return fct.a(this.e);
      }

      public vu b() {
         return this.e;
      }
   }

   public static record c(UUID a, fth b, AbuseReport c) {
   }
}
